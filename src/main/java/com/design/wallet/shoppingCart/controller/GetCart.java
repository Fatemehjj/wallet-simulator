package com.design.wallet.shoppingCart.controller;

import com.design.wallet.shoppingCart.model.Cart;
import com.design.wallet.shoppingCart.service.GetCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cart")
public class GetCart {
    @Autowired
    GetCartService service;
    @GetMapping("get/{username}")
    public Cart getCart(@PathVariable String username){
        return service.findCart(username);
    }
}
