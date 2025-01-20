package com.example.ecommerceproject.service;

import com.example.ecommerceproject.model.Cart;

public interface CartService {
    public Cart getCart(Long id);
     public String updateCart(Cart cart);
    public String createCart(Cart cart);
    public String deleteCart(Long id);
}
