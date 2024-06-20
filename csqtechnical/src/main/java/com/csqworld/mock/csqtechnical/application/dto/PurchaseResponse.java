package com.csqworld.mock.csqtechnical.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PurchaseResponse {
    private int code;
    private String message;
    private String ticket;
}
