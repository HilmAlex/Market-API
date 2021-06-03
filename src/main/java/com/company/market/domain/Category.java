package com.company.market.domain;

import lombok.Data;

public @Data class Category {
    private Long categoryId;
    private String category;
    private boolean active;
}
