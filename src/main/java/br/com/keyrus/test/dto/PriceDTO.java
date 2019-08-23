package br.com.keyrus.test.dto;

import lombok.Data;

@Data
public class PriceDTO {

    private String currencyIso;
    private String formattedValue;
    private String priceType;
    private Double value;
}
