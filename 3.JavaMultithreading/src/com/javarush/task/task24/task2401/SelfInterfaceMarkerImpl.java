package com.javarush.task.task24.task2401;

/**
 * Created by AndrewUkraine on 07.01.2018.
 */
public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    public void print (String string){
        System.out.println(string);
    }

    public void mat (int a){
        a=3+5;
    }
}
