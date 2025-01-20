package com.example.ecommerceproject.serviceİmpl;

import com.example.ecommerceproject.model.Product;
import com.example.ecommerceproject.repository.ProductRepository;
import com.example.ecommerceproject.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceİmpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(Long id){
      Optional<Product> product =  productRepository.findById(id);
      if (product.isPresent()){
          return product.get();
      }
      else {
          throw new EntityNotFoundException("Product bulunamadı");
      }



    }
      public String createProduct(Product product){
        productRepository.save(product);
        if (productRepository.findById(product.getId()).isPresent()){
            return "Product zaten mevcut";
        }
        return "Product başarılı bir şekilde oluşturuldu";


      }
      public String updateProduct(Product product){
        productRepository.findById(product.getId()).orElseThrow();
        productRepository.save(product);
        return "Product update edildi";



          }

          public String deleteProduct(Long id) {

              Optional<Product> product = productRepository.findById(id);
              if (product.isPresent()) {
                  productRepository.deleteById(id);
                  return "Product bilgisi silindi";
              } else throw new EntityNotFoundException("Product bulunamadı");
          }
           public List<Product> productList(){
          return productRepository.findAll();
           }
      }

