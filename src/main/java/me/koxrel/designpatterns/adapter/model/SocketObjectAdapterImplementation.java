package me.koxrel.designpatterns.adapter.model;

import me.koxrel.designpatterns.adapter.interfaces.SocketAdapter;

// Adapter via composition
public class SocketObjectAdapterImplementation implements SocketAdapter {
    private final Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(socket.getVolt(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convertVolt(socket.getVolt(), 40);
    }

    @Override
    public Volt get1Volt() {
        return convertVolt(socket.getVolt(), 120);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
