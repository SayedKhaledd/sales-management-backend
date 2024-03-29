package com.example.salesmanagement.service;

import com.example.salesmanagement.model.Product;
import com.example.salesmanagement.dto.ProductDto;
import com.example.salesmanagement.transformer.ProductTransformer;
import com.example.salesmanagement.dao.ProductDao;
import com.example.backendcoreservice.service.AbstractService;

public interface ProductService extends AbstractService<Product, ProductDto, ProductTransformer, ProductDao> {

}
