package com.design.wallet.order.model;

import com.design.wallet.shoppingCart.model.Cart;
import com.design.wallet.userWallet.model.Wallet;

public class UserOrderAndWallet {
    Wallet wallet;
    Cart cart;
    String message;

    public UserOrderAndWallet(Wallet wallet, Cart cart, String message) {
        this.wallet = wallet;
        this.cart = cart;
        this.message = message;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
