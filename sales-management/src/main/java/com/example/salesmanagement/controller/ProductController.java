package com.example.salesmanagement.controller;

import com.example.backendcoreservice.controller.AbstractController;
import com.example.salesmanagement.dto.ProductDto;
import com.example.salesmanagement.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController implements AbstractController<ProductService, ProductDto> {

    private final ProductService productService;


    @Override
    public ProductService getService() {
        return productService;
    }

    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable Long id) {
        return getService().findById(id);
    }

    @GetMapping("/all")
    public List<ProductDto> findAll() {
        return getService().findAll();
    }

    @PostMapping("/create")
    public ProductDto create(@RequestBody @Valid ProductDto productDto) {
        return getService().create(productDto);
    }

    @PutMapping("/update")
    public ProductDto update(@RequestBody @Valid ProductDto productDto) {
        return getService().update(productDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }


}
