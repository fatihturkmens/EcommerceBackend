package com.example.ecommerceproject.controller;

import com.example.ecommerceproject.model.Product;
import com.example.ecommerceproject.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
       Product product =  productService.getProduct(id);
       return new ResponseEntity<>(product, HttpStatus.OK);

    }
    @PostMapping("/ekle")
    public ResponseEntity<String> createProduct(@RequestBody @Valid Product product){
       String created= productService.createProduct(product);
       return new ResponseEntity<>(created,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateProduct(@RequestBody @Valid Product product){
        String updated= productService.updateProduct(product);
        return new ResponseEntity<>(updated,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        String deleted = productService.deleteProduct(id);
        return new ResponseEntity<>(deleted,HttpStatus.OK);

    }
    @GetMapping("/all")
    public ResponseEntity<List<Product>> allProducts(){
        return new ResponseEntity<>(productService.productList(),HttpStatus.OK);
    }
}
