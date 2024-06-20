package com.csqworld.mock.csqtechnical.domain.service;

import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.csqworld.mock.csqtechnical.application.dto.Product;
import com.csqworld.mock.csqtechnical.application.dto.PurchaseRequest;
import com.csqworld.mock.csqtechnical.application.dto.PurchaseResponse;
import com.csqworld.mock.csqtechnical.infraestructure.adapter.csqapi.CsqApiAdapter;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {

    private final CsqApiAdapter apiAdapter;
    
    @Override
    public PurchaseResponse purchaseProductWithMiddlePrice() {
        var product=getMiddleProduct().get();
        return apiAdapter.purchaseProduct(PurchaseRequest.builder().amount(product.getAmount()).id(
            product.getId()
        ).build());
    }

    private Optional<Product> getMiddleProduct(){
        var products=apiAdapter.getProductsAdapter();
        return products.stream()
        .sorted(Comparator.comparingDouble(Product::getAmount)) // Supposed that list is not sorted by amount
        .skip(products.size()/2)
        .findFirst();
    }
    
}
