package com.company.market.domain.dto;

import lombok.Data;

public @Data
class AuthenticationResponse {
    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
