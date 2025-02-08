package com.johans.products.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductStockDTO {

    private Long id;

    private String name;

    private String description;

    private double price;

    private int amout;

}
