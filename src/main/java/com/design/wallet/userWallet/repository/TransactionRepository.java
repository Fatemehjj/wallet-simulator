package com.design.wallet.userWallet.repository;

import com.design.wallet.userWallet.model.Transaction;
import com.design.wallet.userWallet.model.TransactionType;
import com.design.wallet.userWallet.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    @Autowired
    WalletRepository walletRepository;
    public void saveTransaction(double amount,String username, TransactionType type){
        Wallet findWallet = walletRepository.findWallet(username);
        transactions.add(new Transaction(
                amount,
                type,
                findWallet.getId()
                ));
    }
    public List<Transaction> getTransactions(String username){
        Wallet findWallet = walletRepository.findWallet(username);
        int userID = findWallet.getId();
        return transactions.stream()
                .filter(transaction -> transaction.getWalletID()==(userID))
                .collect(Collectors.toList());
    }
}
