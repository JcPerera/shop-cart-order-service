package com.shop.cartorderservice.mapper;

import com.shop.cartorderservice.dto.CartDto;
import com.shop.cartorderservice.model.Cart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartMapper {
    Cart cartDtoToCar(CartDto cartDto);
    CartDto cartToCartDto(Cart cart);
    List<Cart> cartDtoListToCartList(List<CartDto> cartDtos);
    List<CartDto> cartListToCartDtoList(List<Cart> carts);
}
