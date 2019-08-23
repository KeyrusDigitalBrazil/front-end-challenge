package br.com.keyrus.test.service;

import br.com.keyrus.test.dto.ProductDTO;
import br.com.keyrus.test.dto.ProductsDTO;
import br.com.keyrus.test.util.KeyrusUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KeyrusProductService {

    public ProductDTO getProductsCode(String productCode) throws Exception {
        ProductsDTO productDTO = KeyrusUtils.create();

        Optional<ProductDTO> prd = Optional.ofNullable(productDTO.getProducts().stream().
                filter(product -> product != null && product.getCode().equals(productCode)).
                findAny().orElseThrow(() -> new Exception("product code not found , " + productCode)));
        return prd.get();
    }

    public ProductsDTO getAllProducts()
    {
        return KeyrusUtils.create();
    }

}
