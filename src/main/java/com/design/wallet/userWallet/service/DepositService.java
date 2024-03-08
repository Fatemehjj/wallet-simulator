package com.design.wallet.userWallet.service;

import com.design.wallet.userWallet.model.TransactionType;
import com.design.wallet.userWallet.model.Wallet;
import com.design.wallet.userWallet.repository.TransactionRepository;
import com.design.wallet.userWallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositService {
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    TransactionRepository transactionRepository;
    public Wallet deposit(double amount,String username) {
        Wallet updatedWallet = walletRepository.findWallet(username);
        updatedWallet.setBalance(updatedWallet.getBalance() + amount);

        transactionRepository.saveTransaction(amount, username, TransactionType.DEPOSIT);

        return updatedWallet;
    }
}
