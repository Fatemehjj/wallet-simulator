package com.design.wallet.books.controller;

import com.design.wallet.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("book")
public class GetBooks {
    @Autowired
    BookService service;
    @GetMapping("all")
    public HashMap<String,Double> findBooks(){
        return service.getBooks();
    }
}
