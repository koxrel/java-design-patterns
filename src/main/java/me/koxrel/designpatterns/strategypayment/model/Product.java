package me.koxrel.designpatterns.strategypayment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class Product {
    private final String upcCode;
    private final BigDecimal price;
}
