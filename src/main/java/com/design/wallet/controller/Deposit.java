package com.design.wallet.controller;

import com.design.wallet.model.Wallet;
import com.design.wallet.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet")
public class Deposit {
    @Autowired
    DepositService service;
    @PutMapping("deposit/{amount}/{username}")
    public Wallet deposit(@PathVariable double amount, @PathVariable String username){
        return service.deposit(amount,username);
    }
}
