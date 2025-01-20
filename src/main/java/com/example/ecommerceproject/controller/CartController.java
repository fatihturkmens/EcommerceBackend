package com.example.ecommerceproject.controller;

import com.example.ecommerceproject.model.Cart;
import com.example.ecommerceproject.service.CartService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCart(@PathVariable Long id) {
        Cart cart = cartService.getCart(id);
        if (cart == null) {
            return new ResponseEntity<>(cart, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(cart, HttpStatus.OK);
        }
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateCart(@RequestBody @Valid Cart cart){
        String update=cartService.updateCart(cart);
        return new ResponseEntity<>(update,HttpStatus.CREATED);

    }
    @PostMapping("/create")
    public ResponseEntity<String> createCart(@RequestBody @Valid Cart cart){
        String create= cartService.createCart(cart);
        return new ResponseEntity<>(create,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteCart(@PathVariable Long id){
        String deleted= cartService.deleteCart(id);
        return new ResponseEntity<>(deleted,HttpStatus.OK);
    }
}
