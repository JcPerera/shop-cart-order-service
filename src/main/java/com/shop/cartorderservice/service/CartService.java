package com.shop.cartorderservice.service;

import com.shop.cartorderservice.dto.CartDto;

import java.util.List;

public interface CartService {
    CartDto createCart(CartDto cartDto);
    CartDto getCartById(String cartId);
    CartDto getCartByUserId(String userId);
    List<CartDto> getAllCarts();
    CartDto updateCart(CartDto cartDto);
    void deleteCart(String cartId);
}
