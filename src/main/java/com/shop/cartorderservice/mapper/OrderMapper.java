package com.shop.cartorderservice.mapper;

import com.shop.cartorderservice.dto.OrderDto;
import com.shop.cartorderservice.model.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order orderDtoToOrder(OrderDto orderDto);
    OrderDto orderToOrderDto(Order order);
    List<Order> orderDtoListToOrderList(List<OrderDto> orderDtos);
    List<OrderDto> orderListToOrderDtoList(List<Order> orders);
}
