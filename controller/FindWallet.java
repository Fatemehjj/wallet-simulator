package com.design.wallet.controller;

import com.design.wallet.model.Wallet;
import com.design.wallet.service.FindWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("wallet")
public class FindWallet {
    @Autowired
    FindWalletService service;
    @GetMapping("find/{username}")
    public Wallet findWallet(@PathVariable String username){
     return service.findWallet(username);
    }
}
