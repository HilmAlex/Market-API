package com.company.market.domain.dto;

import lombok.Data;

public @Data
class AuthenticationRequest {
    private String username;
    private String password;
}
