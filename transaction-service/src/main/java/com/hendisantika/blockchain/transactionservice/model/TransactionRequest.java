package com.hendisantika.blockchain.transactionservice.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-blockchain-contract-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-10
 * Time: 06:23
 */
public class TransactionRequest {
    private int fromId;
    private int toId;
    private long amount;

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
