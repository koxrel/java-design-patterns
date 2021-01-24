package me.koxrel.designpatterns.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public void start() {
        processor.freeze();
        ram.load(132, hd.read(3456, 89));
        processor.jump(132);
        processor.execute();
    }
}
