package me.koxrel.designpatterns.strategypayment.controller;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class CreditCardPayment implements Payment {
    private final String name;
    private final String cardNumber;

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("%.2f paid with Credit Card #%s under %s.\n", amount, cardNumber, name);
    }
}
