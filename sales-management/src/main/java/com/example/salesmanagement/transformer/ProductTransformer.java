package com.example.salesmanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.salesmanagement.transformer.mapper.ProductMapper;
import com.example.salesmanagement.dto.ProductDto;
import com.example.salesmanagement.model.Product;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class ProductTransformer implements AbstractTransformer<Product, ProductDto, ProductMapper> {

    private final ProductMapper productMapper;

    @Override
    public ProductMapper getMapper() {
        return productMapper;
    }


}
