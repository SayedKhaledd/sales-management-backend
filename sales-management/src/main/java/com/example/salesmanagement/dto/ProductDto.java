package com.example.salesmanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.salesmanagement.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
    @NotBlank(message = "this field is required")
    private String name;
    @NotBlank(message = "this field is required")
    private String description;
    @NotEmpty(message = "this field is required")
    private Double price;
    private Category category;
    @NotEmpty(message = "this field is required")
    private Long categoryId;

}
