package com.example.salesmanagement.dao;

import com.example.salesmanagement.dao.repo.ProductRepo;
import com.example.salesmanagement.model.Category;
import com.example.salesmanagement.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProductDaoImpl implements ProductDao {

    private final ProductRepo productRepo;

    @Override
    public ProductRepo getRepo() {
        return productRepo;
    }

    @Override
    public List<Product> findAll() {
        return getRepo().findAllByMarkedAsDeletedFalse();
    }

    @Override
    public void markAsDeleted(Long id) {
        getRepo().markAsDeleted(id);
    }
}

