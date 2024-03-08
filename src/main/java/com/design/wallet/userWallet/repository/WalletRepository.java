package com.design.wallet.userWallet.repository;

import com.design.wallet.userWallet.model.Wallet;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WalletRepository {
   private List<Wallet> wallet = new ArrayList<>();
    public void save(String username){
       wallet.add(new Wallet(0.0, username));
   }
    public Wallet findWallet(String username){
        return (Wallet) wallet.stream()
                .filter(wallet -> wallet.getUsername().equalsIgnoreCase(username))
                .findAny()
                .orElse(null);
    }
    @PostConstruct
    private void init(){
       wallet.add(new Wallet(0.0, "fatemeh"));
        wallet.add(new Wallet(0.0, "siavash"));
        wallet.add(new Wallet(0.0, "maral"));
    }
}
