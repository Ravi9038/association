package com.association.controller;

import com.association.model.CartItem;
import com.association.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @PostMapping("/savecartitem")
    private List<CartItem> saveCartItem(@RequestBody List<CartItem> cartItem){

        return cartItemService.saveCartItem(cartItem);
    }
}
