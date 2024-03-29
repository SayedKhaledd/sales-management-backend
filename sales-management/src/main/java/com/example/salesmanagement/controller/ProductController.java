package com.example.salesmanagement.controller;

import com.example.backendcoreservice.controller.AbstractController;
import com.example.salesmanagement.dto.ProductDto;
import com.example.salesmanagement.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController implements AbstractController<ProductService, ProductDto> {

    private final ProductService productService;


    @Override
    public ProductService getService() {
        return productService;
    }


}
