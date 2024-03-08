package com.design.wallet.userWallet.service;

import com.design.wallet.userWallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddWalletService {
    @Autowired
    WalletRepository repo;
    public String createWallet(String username) {
        if (repo.findWallet(username) == null) {
            repo.save(username);
            return "wallet successfully added";
        }
        else {
            throw new RuntimeException("wallet with this username already exists");
        }
    }
}
