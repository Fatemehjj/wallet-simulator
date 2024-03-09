package com.design.wallet.order.service;

import com.design.wallet.books.repository.BookRepository;
import com.design.wallet.order.model.UserOrderAndWallet;
import com.design.wallet.shoppingCart.model.Cart;
import com.design.wallet.shoppingCart.repository.CartRepository;
import com.design.wallet.userWallet.model.Wallet;
import com.design.wallet.userWallet.repository.WalletRepository;
import com.design.wallet.userWallet.service.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    BookRepository bookRepository;
    @Autowired
    WithdrawService withdraw;
    public UserOrderAndWallet addUserOrder(String username) {
        List<String> booksTitle = cartRepository.findCart(username).getBook();
        HashMap<String, Double> book = bookRepository.getBooks();
        double getAmount = amount(booksTitle, book);
        Wallet withdrawFromWallet = withdraw.withdraw(getAmount, username);

        return new UserOrderAndWallet(withdrawFromWallet,cartRepository.findCart(username), "ordered successfully");
    }
    public double amount(List<String> booksTitle, HashMap<String, Double> books) {
        List<Double> price = new ArrayList<>();
        for (Map.Entry<String, Double> entry : books.entrySet()) {
           if (booksTitle.contains(entry.getKey())){
               price.add(entry.getValue());
           }
        }
        return price.stream()
                .reduce((double) 0, Double::sum);
    }
}
