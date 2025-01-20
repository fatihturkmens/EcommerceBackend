package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Cart;
import com.example.ecommerceproject.model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemsDTO {

    private Product product;

    private Cart cart;

    private double quantity;
}
