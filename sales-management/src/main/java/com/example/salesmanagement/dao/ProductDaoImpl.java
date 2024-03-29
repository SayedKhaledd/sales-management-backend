package com.example.salesmanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.salesmanagement.dao.repo.ProductRepo;

@Component
@AllArgsConstructor
public class ProductDaoImpl implements ProductDao {

    private final ProductRepo productRepo;

    @Override
    public ProductRepo getRepo() {
        return productRepo;
    }
}
