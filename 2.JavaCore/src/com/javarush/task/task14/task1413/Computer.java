package com.javarush.task.task14.task1413;

/**
 * Created by AndrewUkraine on 24.07.2017.
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {

        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;}

        public Mouse getMouse() {
       return mouse;
        }

        public Monitor getMonitor (){
        return monitor;
        }
}
