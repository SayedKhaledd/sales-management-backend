package com.example.salesmanagement.controller;

import com.example.backendcoreservice.controller.AbstractController;
import com.example.salesmanagement.dto.CategoryDto;
import com.example.salesmanagement.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    //a get method to find all categories
    @GetMapping("/all")
    public List<CategoryDto> findAll() {
        return getService().findAll();
    }

}
