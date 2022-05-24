package com.shop.cartorderservice.controller;

import com.shop.cartorderservice.dto.OrderDto;
import com.shop.cartorderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
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
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok(orderService.createOrder(orderDto));
    }

    @GetMapping("/order")
    public ResponseEntity<List<OrderDto>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @DeleteMapping("/order/{orderId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(value = "orderId") String orderId){
        orderService.deleteOrder(orderId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/order/{orderId}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable(value = "orderId") String orderId, @RequestBody OrderDto orderDto){
        orderDto.setId(orderId);
        return ResponseEntity.ok(orderService.updateOrder(orderDto));
    }

    @GetMapping("/order/user/{userId}")
    public ResponseEntity<List<OrderDto>> getUsersAllOrders(@PathVariable(value = "userId") String userId){
        return ResponseEntity.ok(orderService.getAllOrdersByUserId(userId));
    }
}
