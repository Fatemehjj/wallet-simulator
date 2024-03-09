package com.design.wallet.order.controller;

import com.design.wallet.order.model.UserOrderAndWallet;
import com.design.wallet.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class Order {
    @Autowired
    OrderService service;
    @GetMapping("{username}")
    public UserOrderAndWallet order(@PathVariable String username){
        return service.addUserOrder(username);
    }
}
