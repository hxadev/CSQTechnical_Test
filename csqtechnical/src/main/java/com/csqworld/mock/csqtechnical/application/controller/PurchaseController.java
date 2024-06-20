package com.csqworld.mock.csqtechnical.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csqworld.mock.csqtechnical.application.dto.PurchaseResponse;
import com.csqworld.mock.csqtechnical.domain.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService service;

    @GetMapping("/purchase-mid-product")
    public ResponseEntity<PurchaseResponse> purchaseMidProduct(){
        return ResponseEntity.ok(service.purchaseProductWithMiddlePrice());
    }
    
}
