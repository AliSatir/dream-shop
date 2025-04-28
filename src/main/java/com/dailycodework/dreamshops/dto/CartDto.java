package com.dailycodework.dreamshops.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
public class CartDto {
    private Long cartId;
    private Set<CartItemDto> Items = new HashSet<>();
    private BigDecimal totalAmount;
}
