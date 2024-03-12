package com.design.wallet.shoppingCart.service;

import com.design.wallet.books.repository.BookRepository;
import com.design.wallet.shoppingCart.model.Cart;
import com.design.wallet.shoppingCart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddOrderService {
    @Autowired
    CartRepository repository;
    @Autowired
    BookRepository bookRepository;
    public Cart addOrder(String book, String username) {
        if (repository.findCart(username)!=null && bookRepository.getBooks().containsKey(book)){
                return repository.addOrder(book, username); }

        else if (bookRepository.getBooks().containsKey(book)){
               repository.addCart(username);
                return repository.addOrder(book, username);

        }
        else throw new RuntimeException("Couldn't add order'");
    }
}
