package me.koxrel.designpatterns.strategypayment.controller;

import java.math.BigDecimal;

public interface Payment {
    void pay(BigDecimal amount);
}
