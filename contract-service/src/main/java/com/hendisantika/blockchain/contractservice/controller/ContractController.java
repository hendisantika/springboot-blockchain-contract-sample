package com.hendisantika.blockchain.contractservice.controller;

import com.hendisantika.blockchain.contractservice.model.Contract;
import com.hendisantika.blockchain.contractservice.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-blockchain-contract-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-10
 * Time: 06:21
 */
@RestController
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    ContractService service;

    @GetMapping("/owner")
    public String getOwnerAccount() {
        return service.getOwnerAccount();
    }

    @PostMapping
    public Contract createContract(@RequestBody Contract newContract) throws Exception {
        return service.createContract(newContract);
    }

}
