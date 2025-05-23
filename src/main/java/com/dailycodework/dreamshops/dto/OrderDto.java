package com.dailycodework.dreamshops.dto;

import com.dailycodework.dreamshops.model.OrderItem;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Data
public class OrderDto {
    private Long orderId;
    private Long userId;
    private LocalDate orderDate;
    private BigDecimal totalAmount;
    private String  orderStatus;
    private Set<OrderItemDto> orderItems;
}
