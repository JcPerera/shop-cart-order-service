package com.shop.cartorderservice.service.impl;

import com.shop.cartorderservice.dto.CartDto;
import com.shop.cartorderservice.mapper.CartMapper;
import com.shop.cartorderservice.model.Cart;
import com.shop.cartorderservice.repository.CartRepository;
import com.shop.cartorderservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Autowired
    CartRepository cartRepository;

    @Override
    public CartDto createCart(CartDto cartDto) {
        Cart cart = cartMapper.cartDtoToCar(cartDto);
        cart.setUpdatedAt(new Date());
        cart.setUpdatedAt(new Date());
        Cart savedCart = cartRepository.save(cart);
        return cartMapper.cartToCartDto(savedCart);
    }

    @Override
    public CartDto getCartById(String cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        return cartMapper.cartToCartDto(cart);
    }

    @Override
    public CartDto getCartByUserId(String userId) {
        Cart cart = cartRepository.findCartByUserId(userId);
        return cartMapper.cartToCartDto(cart);
    }

    @Override
    public List<CartDto> getAllCarts() {
        List<Cart> carts = cartRepository.findAll();
        return cartMapper.cartListToCartDtoList(carts);
    }

    @Override
    public CartDto updateCart(CartDto cartDto) {
        Cart cart = cartRepository.findById(cartDto.getId()).orElse(null);
        Cart updatedCart = null;
        if (cart != null) {
            cart.setUpdatedAt(new Date());
            updatedCart = cartRepository.save(cart);
        }
        return cartMapper.cartToCartDto(updatedCart);
    }

    @Override
    public void deleteCart(String cartId) {
        cartRepository.deleteById(cartId);
    }
}
