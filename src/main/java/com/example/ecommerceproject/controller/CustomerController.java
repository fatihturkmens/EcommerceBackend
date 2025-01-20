package com.example.ecommerceproject.controller;

import com.example.ecommerceproject.model.Customer;
import com.example.ecommerceproject.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

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
