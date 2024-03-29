package com.example.salesmanagement.service;

import com.example.backendcoreservice.service.AbstractService;
import com.example.salesmanagement.dao.CategoryDao;
import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.model.Category;
import com.example.salesmanagement.transformer.CategoryTransformer;

import java.util.List;

public interface CategoryService extends AbstractService<Category, CategoryDto, CategoryTransformer, CategoryDao> {
    List<CategoryDto> findAll();

}
