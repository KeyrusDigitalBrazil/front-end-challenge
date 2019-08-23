package br.com.keyrus.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ProductDTO {

    private boolean availableForPickup;
    private List<Categories> categories;
    private String code ;
    private String description;
    private String manufacturer;
    private String name;
    private PriceDTO price;
    private StockDTO stock;
    private String summary;



}
