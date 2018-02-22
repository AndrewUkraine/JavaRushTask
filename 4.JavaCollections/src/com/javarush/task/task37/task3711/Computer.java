package com.javarush.task.task37.task3711;

/**
 * Created by AndrewUkraine on 14.11.2017.
 */
public class Computer {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDrive hardDrive = new HardDrive();

    void run(){
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
