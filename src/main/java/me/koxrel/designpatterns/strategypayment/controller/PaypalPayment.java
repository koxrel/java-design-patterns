package me.koxrel.designpatterns.strategypayment.controller;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class PaypalPayment implements Payment{
    private final String email;
    private final String password;

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("%.2f paid with Paypal under %s.\n", amount, email);
    }
}
