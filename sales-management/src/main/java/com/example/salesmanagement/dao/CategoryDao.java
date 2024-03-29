package com.example.salesmanagement.dao;

import com.example.backendcoreservice.dao.AbstractDao;
import com.example.salesmanagement.dao.repo.CategoryRepo;
import com.example.salesmanagement.model.Category;

import java.util.List;

public interface CategoryDao extends AbstractDao<Category, CategoryRepo> {
    List<Category> findAll();
}
