package com.shop.cartorderservice.service;

import com.shop.cartorderservice.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
    List<OrderDto> getAllOrders();
    OrderDto updateOrder(OrderDto orderDto);
    void deleteOrder(String orderId);
    List<OrderDto> getAllOrdersByUserId(String userId);
}
