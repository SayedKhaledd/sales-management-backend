package com.example.salesmanagement.transformer.mapper;

import com.example.backendcoreservice.transformer.mapper.AbstractMapper;
import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.model.Category;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CategoryMapper extends AbstractMapper<Category, CategoryDto> {
}
