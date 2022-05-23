package com.shop.cartorderservice.service;

import com.shop.cartorderservice.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getAllOrders();
    Order updateOrder(Order order);
    void deleteOrder(String orderId);
}
