package com.shop.cartorderservice.repository;

import com.shop.cartorderservice.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository  extends MongoRepository<Cart, String> {
    Cart findCartByUserId(String userId);
}
