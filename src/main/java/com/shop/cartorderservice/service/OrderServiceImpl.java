package com.shop.cartorderservice.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shop.cartorderservice.dto.Address;
import com.shop.cartorderservice.dto.ProductQty;
import com.shop.cartorderservice.model.Order;
import com.shop.cartorderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        order.setCreatedAt(new Date());
        order.setUpdatedAt(new Date());
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Order newOrder) {
        Order order = orderRepository.findById(newOrder.getId()).orElse(null);
        if(order!= null){
            order.setProducts(newOrder.getProducts());
            order.setAmount(newOrder.getAmount());
            order.setAddress(newOrder.getAddress());
            order.setStatus(newOrder.getStatus());
            order.setUpdatedAt(new Date());
            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }
}
