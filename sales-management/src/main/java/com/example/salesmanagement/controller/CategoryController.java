package com.example.salesmanagement.controller;

import com.example.backendcoreservice.controller.AbstractController;
import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.service.CategoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController()
@RequestMapping("/api/category")
public class CategoryController implements AbstractController<CategoryService, CategoryDto> {
    private final CategoryService categoryService;

    @Override
    public CategoryService getService() {
        return categoryService;
    }

    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable Long id) {
        return getService().findById(id);
    }

    @GetMapping("/all")
    public List<CategoryDto> findAll() {
        return getService().findAll();
    }

    @PostMapping("/create")
    public CategoryDto create(@RequestBody @Valid CategoryDto categoryDto) {
        return getService().create(categoryDto);
    }

}
