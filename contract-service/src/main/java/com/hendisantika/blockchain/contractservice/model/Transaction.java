package com.hendisantika.blockchain.contractservice.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-blockchain-contract-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-10
 * Time: 06:15
 */
public class Transaction {
    private String contract;
    private long amount;

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

}
