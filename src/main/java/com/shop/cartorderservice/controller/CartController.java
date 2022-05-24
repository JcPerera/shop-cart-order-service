package com.shop.cartorderservice.controller;

import com.shop.cartorderservice.dto.CartDto;
import com.shop.cartorderservice.dto.OrderDto;
import com.shop.cartorderservice.service.CartService;
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
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/cart")
    public ResponseEntity<CartDto> createCart(@RequestBody CartDto cartDto) {
        return ResponseEntity.ok(cartService.createCart(cartDto));
    }

    @GetMapping("/cart")
    public ResponseEntity<List<CartDto>> getAllCarts() {
        return ResponseEntity.ok(cartService.getAllCarts());
    }

    @GetMapping("/cart/{cartId}")
    public ResponseEntity<CartDto> getCartByCartId(@PathVariable(value = "cartId") String cartId) {
        return ResponseEntity.ok(cartService.getCartById(cartId));
    }

    @DeleteMapping("/cart/{cartId}")
    public ResponseEntity<Void> deleteCartById(@PathVariable(value = "cartId") String cartId) {
        cartService.deleteCart(cartId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/order/{cartId}")
    public ResponseEntity<CartDto> updateCart(@PathVariable(value = "cartId") String cartId, @RequestBody CartDto cartDto) {
        cartDto.setId(cartId);
        return ResponseEntity.ok(cartService.updateCart(cartDto));
    }

    @GetMapping("/cart/user/{userId}")
    public ResponseEntity<CartDto> getCartByUserId(@PathVariable(value = "userId") String userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }
}
