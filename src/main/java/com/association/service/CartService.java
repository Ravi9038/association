package com.association.service;

import com.association.model.Cart;
import com.association.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    public Cart saveCartData(Cart cart) {
        return cartRepository.save(cart);
    }
}
