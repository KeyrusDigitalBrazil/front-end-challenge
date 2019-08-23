package br.com.keyrus.test.controller;


import br.com.keyrus.test.service.KeyrusProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;


@RestController
@RequestMapping("/retrieve-product")
public class ProductController {

    @Autowired
    private KeyrusProductService keyrusProductService;

    @GetMapping(value = "/products",produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String getAllProducts() throws  Exception    {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(keyrusProductService.getAllProducts());
    }

    @GetMapping(value = "/{id}",produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String getProductCode(@PathVariable String id) throws Exception {

        ObjectMapper objectMapper  = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(keyrusProductService.getProductsCode(id));
    }
}
