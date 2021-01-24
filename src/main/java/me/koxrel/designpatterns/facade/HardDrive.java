package me.koxrel.designpatterns.facade;

public class HardDrive {
    public byte[] read(long Iba, int size) {
        return new byte[]{'f', 'z'};
    }
}
