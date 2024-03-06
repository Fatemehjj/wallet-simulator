package com.design.wallet.service;

import com.design.wallet.controller.Transactions;
import com.design.wallet.model.Transaction;
import com.design.wallet.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsService {

    @Autowired
    TransactionRepository repository;
    public List<Transaction> getTransactions(String username) {
        return repository.getTransactions(username);
    }
}
