package com.design.wallet.service;

import com.design.wallet.model.Wallet;
import com.design.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindWalletService {
    @Autowired
    WalletRepository repository;
    public Wallet findWallet(String username) {

        return repository.findWallet(username);
    }
}
