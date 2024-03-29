package com.example.salesmanagement.service;

import com.example.salesmanagement.dao.CategoryDao;
import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.transformer.CategoryTransformer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryDao categoryDao;
    private final CategoryTransformer categoryTransformer;

    @Override
    public CategoryDao getDao() {
        return categoryDao;
    }

    @Override
    public CategoryTransformer getTransformer() {
        return categoryTransformer;
    }

    @Override
    public List<CategoryDto> findAll() {
        log.info("CategoryService: findAll() was called");
        return getTransformer().transformEntitiesToDtos(getDao().findAll());
    }
}
