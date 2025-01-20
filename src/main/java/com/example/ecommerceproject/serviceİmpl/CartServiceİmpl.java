package com.example.ecommerceproject.serviceİmpl;

import com.example.ecommerceproject.dto.CartDTO;
import com.example.ecommerceproject.model.Cart;
import com.example.ecommerceproject.repository.CartRepository;
import com.example.ecommerceproject.service.CartService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceİmpl implements CartService {


    @Autowired
    private CartRepository cartRepository;


    public Cart getCart(Long id){
       Cart cart=cartRepository.findByCustomerId(id);
       if (cart==null){
           throw new EntityNotFoundException("Müşteri bulunamadı");

       }else return cart;
    }

        public String updateCart(Cart cart){
        cartRepository.findById(cart.getId()).orElseThrow();
        cartRepository.save(cart);
        return "Cart bilgisi update edildi";
    }

    public String createCart(Cart cart){
       cartRepository.save(cart);
       return "Cart bilgileri kaydedildi";

    }
     public String deleteCart(Long id){
        if (cartRepository.findById(id).isPresent()){
            cartRepository.deleteById(id);
            return "seçili Cart silindi";
        }
        else {
            return "Bu Cart zaten mevcut değil";
        }
     }



}
