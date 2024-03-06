package com.design.wallet.controller;

import com.design.wallet.model.Wallet;
import com.design.wallet.service.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet")
public class Withdraw {
    @Autowired
    WithdrawService service;
    @PutMapping("withdraw/{amount}/{username}")
    public Wallet withdraw(@PathVariable double amount, @PathVariable String username){
        return service.withdraw(amount, username);
    }
}
