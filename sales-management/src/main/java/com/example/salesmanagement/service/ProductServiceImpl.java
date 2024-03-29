package com.example.salesmanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.salesmanagement.dao.ProductDao;
import com.example.salesmanagement.transformer.ProductTransformer;

@Slf4j
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    private final ProductTransformer productTransformer;

    @Override
    public ProductDao getDao() {
        return productDao;
    }

    @Override
    public ProductTransformer getTransformer() {
        return productTransformer;
    }
    



}
