package com.dailycodework.dreamshops.service.order;

import com.dailycodework.dreamshops.dto.OrderDto;
import com.dailycodework.dreamshops.dto.OrderItemDto;
import com.dailycodework.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order pleaceOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
