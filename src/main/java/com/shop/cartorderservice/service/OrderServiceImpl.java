package com.shop.cartorderservice.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shop.cartorderservice.dto.Address;
import com.shop.cartorderservice.dto.OrderDto;
import com.shop.cartorderservice.dto.ProductQty;
import com.shop.cartorderservice.mapper.OrderMapper;
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

    @Autowired
    OrderMapper orderMapper;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = orderMapper.orderDtoToOrder(orderDto);
        order.setUpdatedAt(new Date());
        order.setCreatedAt(new Date());
        Order newOrder = orderRepository.save(order);
        return orderMapper.orderToOrderDto(newOrder);
    }

    @Override
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.orderListToOrderDtoList(orders);
    }

    @Override
    public OrderDto updateOrder(OrderDto orderDto) {
        Order order = orderRepository.findById(orderDto.getId()).orElse(null);
        OrderDto updatedOrderDto = null;
        if(order!= null){
            order = orderMapper.orderDtoToOrder(orderDto);
            order.setUpdatedAt(new Date());
            Order updatedOrder = orderRepository.save(order);
            updatedOrderDto = orderMapper.orderToOrderDto(updatedOrder);
        }
        return updatedOrderDto;
    }

    @Override
    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }
}
