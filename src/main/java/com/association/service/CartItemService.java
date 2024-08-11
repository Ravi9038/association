package com.association.service;

import com.association.model.CartItem;
import com.association.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;


    public List<CartItem> saveCartItem(List<CartItem> cartItem) {
        return cartItemRepository.saveAll(cartItem);
    }
}
