package com.example.salesmanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.salesmanagement.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto extends AbstractDto {

    private Long id;
    private String name;
    private Double price;
    private Category category;
    private Long categoryId;

}
