package com.design.wallet.controller;

import com.design.wallet.model.Transaction;
import com.design.wallet.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("wallet")
public class Transactions {
    @Autowired
    TransactionsService service;
    @GetMapping("transactions/{username}")
    public List<Transaction> getTransactions(@PathVariable String username) {
        return service.getTransactions(username);
    }
}
