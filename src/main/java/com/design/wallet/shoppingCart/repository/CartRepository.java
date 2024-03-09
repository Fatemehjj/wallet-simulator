package com.design.wallet.shoppingCart.repository;

import com.design.wallet.shoppingCart.model.Cart;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepository {
    List<Cart> carts = new ArrayList<>();
   //add cart
    public Cart addOrder(String book,String username) {
        Cart userCart = findCart(username);
        userCart.getBook().add(book);
        return userCart;
    }
    public Cart findCart(String username){
        return (Cart) carts.stream()
                .filter(cart -> cart.getUsername().equalsIgnoreCase(username))
                .findAny()
                .orElse(null);
    }
    @PostConstruct
    private void init(){
        List<String> books= new ArrayList<>();
        books.add("The Great Gatsby");
        books.add("In Search of Lost Time");
        books.add("The Catcher in the Rye");
        carts.add(new Cart(books,"saied"));
    }
}
