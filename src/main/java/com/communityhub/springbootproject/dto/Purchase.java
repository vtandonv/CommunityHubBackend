package com.communityhub.springbootproject.dto;

import com.communityhub.springbootproject.entity.Address;
import com.communityhub.springbootproject.entity.Customer;
import com.communityhub.springbootproject.entity.Order;
import com.communityhub.springbootproject.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address address;

    private Order order;
    private Set<OrderItem> orderItems;

}
