package com.example.salesmanagement.dao;

import com.example.salesmanagement.model.Product;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.salesmanagement.dao.repo.ProductRepo;

public interface ProductDao extends AbstractDao<Product, ProductRepo> {
}
