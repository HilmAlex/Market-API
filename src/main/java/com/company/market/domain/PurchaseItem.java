package com.company.market.domain;

import lombok.Data;

import java.math.BigDecimal;

public @Data class PurchaseItem {
    private Long productId;
    private int quantity;
    private BigDecimal total;
    private boolean active;


}
