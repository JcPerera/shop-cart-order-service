package com.shop.cartorderservice.repository;

import com.shop.cartorderservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
