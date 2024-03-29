package com.example.salesmanagement.transformer;

import com.example.backendcoreservice.transformer.AbstractTransformer;
import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.model.Category;
import com.example.salesmanagement.transformer.mapper.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CategoryTransformer implements AbstractTransformer<Category, CategoryDto, CategoryMapper> {
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryMapper getMapper() {
        return categoryMapper;
    }
}
