package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemsDTO {

    private Order order;
}
