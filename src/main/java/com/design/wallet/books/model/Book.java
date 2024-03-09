package com.design.wallet.books.model;

import java.util.HashMap;
import java.util.List;

public class Book {
    HashMap<String, Double> books;

    public Book(HashMap<String, Double> books) {
        this.books = books;
    }

    public HashMap<String, Double> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Double> books) {
        this.books = books;
    }
}
