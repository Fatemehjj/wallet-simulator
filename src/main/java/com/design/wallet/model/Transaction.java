package com.design.wallet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Transaction{
    private static final AtomicInteger count = new AtomicInteger(0);
    Integer transactionID;
    double amount;
    TransactionType type;
    Integer walletID;

    public Transaction(double amount, TransactionType type, Integer walletID) {
        this.transactionID = count.incrementAndGet();
        this.amount = amount;
        this.type = type;
        this.walletID = walletID;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID() {
        transactionID = count.incrementAndGet();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Integer getWalletID() {
        return walletID;
    }

    public void setWalletID(Integer walletID) {
        this.walletID = walletID;
    }
}
