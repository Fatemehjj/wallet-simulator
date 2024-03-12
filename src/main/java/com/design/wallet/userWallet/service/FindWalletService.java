package com.design.wallet.userWallet.service;

import com.design.wallet.userWallet.model.Wallet;
import com.design.wallet.userWallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindWalletService {
    @Autowired
    WalletRepository repository;
    public Wallet findWallet(String username) {
        Wallet findWallet = repository.findWallet(username);
         if (findWallet != null)
           return findWallet;
         else throw new RuntimeException("cannot find wallet");
    }
}
