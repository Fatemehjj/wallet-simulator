package com.design.wallet.books.service;

import com.design.wallet.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BookService {
    @Autowired
    BookRepository repository;
    public HashMap<String, Double> getBooks() {
        return repository.getBooks();
    }
}
