package com.example.salesmanagement.dao;

import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.model.Category;
import com.example.salesmanagement.model.Product;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.salesmanagement.dao.repo.ProductRepo;

import java.util.List;

public interface ProductDao extends AbstractDao<Product, ProductRepo> {
    List<Product> findAll();

    void markAsDeleted(Long id);
}
