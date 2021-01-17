package me.koxrel.designpatterns.strategypayment.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private final String upcCode;
    private final BigDecimal price;
}
