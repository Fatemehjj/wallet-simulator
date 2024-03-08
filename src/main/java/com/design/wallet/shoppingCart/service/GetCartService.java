package com.design.wallet.shoppingCart.service;

import com.design.wallet.shoppingCart.model.Cart;
import com.design.wallet.shoppingCart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCartService {
    @Autowired
    CartRepository repository;
    public Cart findCart(String username) {
        return repository.findCart(username);
    }
}
