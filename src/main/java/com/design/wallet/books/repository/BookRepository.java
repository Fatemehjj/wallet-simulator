package com.design.wallet.books.repository;

import com.design.wallet.shoppingCart.model.Cart;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BookRepository {
    HashMap<String, Double> books = new HashMap<String, Double>();

    public HashMap<String, Double> getBooks() {
        return books;
    }
    @PostConstruct
    private void init(){
       books.put("The Great Gatsby", 260000.0);
       books.put("In Search of Lost Time", 360000.5);
       books.put("The Catcher in the Rye", 140000.0);
        books.put("lolita", 180000.0);
    }
}
