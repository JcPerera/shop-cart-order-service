package com.shop.cartorderservice.controller;

import com.shop.cartorderservice.model.Order;
import com.shop.cartorderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Void> createOrder(@RequestBody Order order){
        orderService.createOrder(order);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @DeleteMapping("/order/{orderId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(value = "orderId") String orderId){
        orderService.deleteOrder(orderId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/order/{orderId}")
    public ResponseEntity<Order> updateOrder(@PathVariable(value = "orderId") String orderId, @RequestBody Order order){
        order.setId(orderId);
        return ResponseEntity.ok(orderService.updateOrder(order));
    }
}
