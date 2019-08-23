package br.com.keyrus.test.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductsDTO {
    private List<ProductDTO> products;
}
