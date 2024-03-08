package com.design.wallet.userWallet.controller;

import com.design.wallet.userWallet.service.AddWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("wallet")
@RestController
public class CreateWallet {
    @Autowired
    AddWalletService service;
    @PostMapping("create/{username}")
    public String createWallet(@PathVariable String username){
        return service.createWallet(username);
    }
}
