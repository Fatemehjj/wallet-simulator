package com.design.wallet.userWallet.service;

import com.design.wallet.userWallet.model.TransactionType;
import com.design.wallet.userWallet.model.Wallet;
import com.design.wallet.userWallet.repository.TransactionRepository;
import com.design.wallet.userWallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawService {
    @Autowired
    WalletRepository repository;
    @Autowired
    TransactionRepository transactionRepository;
    public Wallet withdraw(double amount, String username) {
        Wallet wallet = repository.findWallet(username);
        if (wallet.getBalance() >= amount) {
            wallet.setBalance(Math.abs(wallet.getBalance() - amount));
            transactionRepository.saveTransaction(amount, username, TransactionType.WITHDRAW);
            return wallet;
        }else throw new RuntimeException("Cannot withdraw");
    }
}
