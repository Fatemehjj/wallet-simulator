package com.design.wallet.userWallet.service;

import com.design.wallet.userWallet.model.Transaction;
import com.design.wallet.userWallet.repository.TransactionRepository;
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
