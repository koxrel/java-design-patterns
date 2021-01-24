package me.koxrel.designpatterns.adapter;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.adapter.interfaces.SocketAdapter;
import me.koxrel.designpatterns.adapter.model.SocketAdapterImplementation;
import me.koxrel.designpatterns.adapter.model.SocketObjectAdapterImplementation;
import me.koxrel.designpatterns.adapter.model.Volt;

public class AdapterPattern implements Driver {
    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImplementation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.printf("Object Adapter...\nV3 volts: %d\nV12 volts: %d\nV120 volts: %d\n",
                v3.getVolts(), v12.getVolts(), v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.printf("Class Adapter...\nV3 volts: %d\nV12 volts: %d\nV120 volts: %d\n",
                v3.getVolts(), v12.getVolts(), v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        return switch (i) {
            case 3 -> socketAdapter.get3Volts();
            case 12 -> socketAdapter.get12Volts();
            case 1 -> socketAdapter.get1Volt();
            default -> socketAdapter.get120Volts();
        };
    }

    @Override
    public void run() {
        testObjectAdapter();
        testClassAdapter();
    }
}
