package com.example.salesmanagement.dao;

import com.example.salesmanagement.dao.repo.CategoryRepo;
import com.example.salesmanagement.model.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class CategoryDaoImpl implements CategoryDao {
    private final CategoryRepo categoryRepo;

    @Override
    public CategoryRepo getRepo() {
        return categoryRepo;
    }

    @Override
    public List<Category> findAll() {
        return getRepo().findAllByMarkedAsDeletedFalse();
    }
}
