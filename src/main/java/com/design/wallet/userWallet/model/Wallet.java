package com.design.wallet.userWallet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Wallet{
   private Integer id;
    private double balance;
    private String username;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Wallet(double balance, String username) {
        this.id = count.incrementAndGet();
        this.balance = balance;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        id = count.incrementAndGet();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
