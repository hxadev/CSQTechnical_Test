package com.csqworld.mock.csqtechnical.infraestructure.adapter.csqapi;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.csqworld.mock.csqtechnical.application.constant.Constant;
import com.csqworld.mock.csqtechnical.application.dto.Product;
import com.csqworld.mock.csqtechnical.application.dto.PurchaseRequest;
import com.csqworld.mock.csqtechnical.application.dto.PurchaseResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@FeignClient(name="csqapi-adapter-client", url="${clients.csq-api.url}")
public interface CsqApiAdapter {

    @GetMapping(Constant.Endpoint.GETPRODUCTS)
    List<Product> getProductsAdapter();

    @PostMapping(Constant.Endpoint.POSTPURCHASEPRODUCT)
    PurchaseResponse purchaseProduct(@RequestBody PurchaseRequest request);
    
}
