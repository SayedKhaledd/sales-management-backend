package com.example.salesmanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryDto extends AbstractDto {
    private Long id;
    @NotBlank(message = "this field is required")
    private String name;
}
