package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Customer;
import com.example.ecommerceproject.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private Customer customer;
    private double totalPrice;
    private List<Product> productList;

}
