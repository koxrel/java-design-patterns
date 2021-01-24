package me.koxrel.designpatterns.adapter.interfaces;

import me.koxrel.designpatterns.adapter.model.Volt;

public interface SocketAdapter {
    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volt();
}
