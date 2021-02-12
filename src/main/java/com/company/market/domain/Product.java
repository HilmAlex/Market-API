package com.company.market.domain;

import lombok.Data;

public @Data class Product {
    private Long productId;
    private String name;
    private Long categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;


}
