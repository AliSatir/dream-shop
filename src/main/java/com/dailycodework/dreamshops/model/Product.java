package com.dailycodework.dreamshops.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal pricer;
    private int inventory;
    private String description;

    private Category category;

    private List<Image> images;
}
