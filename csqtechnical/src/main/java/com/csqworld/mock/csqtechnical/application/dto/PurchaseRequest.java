package com.csqworld.mock.csqtechnical.application.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PurchaseRequest {
    private Long id;
    private Double amount;
}
