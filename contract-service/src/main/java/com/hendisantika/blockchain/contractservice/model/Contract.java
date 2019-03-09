package com.hendisantika.blockchain.contractservice.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-blockchain-contract-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-10
 * Time: 06:14
 */
public class Contract {
    private int fee;
    private String receiver;
    private String address;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
