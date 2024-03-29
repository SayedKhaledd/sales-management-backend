package com.example.salesmanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.salesmanagement.dto.ProductDto;
import com.example.salesmanagement.model.Product;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper extends AbstractMapper<Product, ProductDto> {


}
