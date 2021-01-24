package me.koxrel.designpatterns.facade;

import me.koxrel.designpatterns.Driver;

public class FacadePattern implements Driver {
    @Override
    public void run() {
        var cpu = new CPU();
        var memory = new Memory();
        var hd = new HardDrive();
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hd);
        computerFacade.start();
    }
}
