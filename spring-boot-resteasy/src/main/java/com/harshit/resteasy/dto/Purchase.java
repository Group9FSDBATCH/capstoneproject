package com.harshit.resteasy.dto;

import com.harshit.resteasy.entity.Address;
import com.harshit.resteasy.entity.Customer;
import com.harshit.resteasy.entity.Order;
import com.harshit.resteasy.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private  Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
