package com.design.wallet.shoppingCart.controller;

import com.design.wallet.shoppingCart.model.Cart;
import com.design.wallet.shoppingCart.service.AddOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class AddOrder {
    @Autowired
    AddOrderService service;
    @PostMapping("add/{book}/{username}")
    public Cart addOrder(@PathVariable String book, @PathVariable String username){
             return service.addOrder(book, username);
    }
}
