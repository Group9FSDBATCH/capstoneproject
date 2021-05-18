package com.harshit.resteasy.dao;

import com.harshit.resteasy.entity.Order;

import java.util.List;

public interface OrdersDAO {
    public List<Order> findAll();
}
