package com.dailycodework.dreamshops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long productId;
    private int quantity;
    private String productName;
    private String productBrand;
    private BigDecimal price;

}
