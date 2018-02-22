package com.javarush.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() throws InterruptedException {
        while (!isValuePresent){
            wait();}
        System.out.println("Got: " + value);
        isValuePresent=false;
        notifyAll();
        return value;
    }

    public synchronized void put(int value) throws InterruptedException {


        this.value = value;

        while (isValuePresent){
            wait();}
        isValuePresent=true;
        notifyAll();
        System.out.println("Put: " + value);
    }
}
