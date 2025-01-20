package com.example.ecommerceproject.service;

import com.example.ecommerceproject.model.Product;

import java.util.List;

public interface ProductService {

    public Product getProduct(Long id);
    public String createProduct(Product product);

    public String updateProduct(Product product);
    public String deleteProduct(Long id);
    public List<Product> productList();
}
