package com.example.salesmanagement.service;

import com.example.salesmanagement.dao.ProductDao;
import com.example.salesmanagement.dto.ProductDto;
import com.example.salesmanagement.transformer.ProductTransformer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    private final ProductTransformer productTransformer;
    private final CategoryService categoryService;

    @Override
    public ProductDao getDao() {
        return productDao;
    }

    @Override
    public ProductTransformer getTransformer() {
        return productTransformer;
    }

    @Override
    public List<ProductDto> findAll() {
        return getTransformer().transformEntitiesToDtos(getDao().findAll());
    }

    @Override
    public ProductDto create(ProductDto dto) {
        dto.setCategory(categoryService.findById(dto.getCategoryId()));
        return ProductService.super.create(dto);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        getDao().markAsDeleted(id);
    }
}
