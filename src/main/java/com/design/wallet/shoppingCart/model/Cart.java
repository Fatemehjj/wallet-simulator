package com.design.wallet.shoppingCart.model;

import java.util.List;

public class Cart{
    List<String> book;
    String username;

    public Cart(List<String> book, String username) {
        this.book = book;
        this.username = username;
    }

    public List<String> getBook() {
        return book;
    }

    public void setBook(List<String> book) {
        this.book = book;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
