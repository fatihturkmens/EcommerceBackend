package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Cart;
import com.example.ecommerceproject.model.Order;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {


    @NotEmpty(message = "firstname alanı boş bırakılamaz")
    @Size(min = 3,max = 20)
    private String firstName;



    @NotEmpty(message = "lastname alanı boş bırakılamaz")
    @Size(min = 3,max = 25)
    private String lastName;


    @NotEmpty(message = "gender alanı boş bırakılamaz")
    @Size(min = 3,max = 6)
    private String gender;

    private Integer phoneNo;


    @NotEmpty(message = "email alanı boş bırakılamaz")
    @Size(min = 7,max = 30)
    private String email;

    private Cart cart;

    private List<Order> orderList;


    @NotEmpty(message = "city alanı boş bırakılamaz")
    @Size(min = 3,max = 25)
    private String city;


    @NotEmpty(message = "street alanı boş bırakılamaz")
    @Size(min = 3,max = 40)
    private String street;
}
