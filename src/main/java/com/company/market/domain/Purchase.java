package com.company.market.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

public @Data
class Purchase {

    private Long purchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> items;


}
