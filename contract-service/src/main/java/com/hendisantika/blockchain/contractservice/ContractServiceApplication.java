package com.hendisantika.blockchain.contractservice;

import com.hendisantika.blockchain.contractservice.service.ContractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.web3j.protocol.Web3j;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ContractServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContractServiceApplication.class);

    @Autowired
    Web3j web3j;
    @Autowired
    ContractService service;

    public static void main(String[] args) {
        SpringApplication.run(ContractServiceApplication.class, args);
    }

    @PostConstruct
    public void listen() {
        web3j.transactionObservable().subscribe(tx -> {
            if (tx.getTo() != null && tx.getTo().equals(service.getOwnerAccount())) {
                LOGGER.info("New tx: id={}, block={}, from={}, to={}, value={}", tx.getHash(), tx.getBlockHash(), tx.getFrom(), tx.getTo(), tx.getValue().intValue());
                service.processContracts(tx.getValue().longValue());
            } else {
                LOGGER.info("Not matched: id={}, to={}", tx.getHash(), tx.getTo());
            }
        });
    }
}
