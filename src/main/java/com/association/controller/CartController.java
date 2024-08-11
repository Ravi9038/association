package com.association.controller;

import com.association.model.Cart;
import com.association.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/savecart")
    public Cart saveCartData(@RequestBody Cart cart){
        return  cartService.saveCartData(cart);
    }

}
