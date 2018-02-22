package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread st1 = new SpecialThread();
        SpecialThread st2 = new SpecialThread();
        SpecialThread st3 = new SpecialThread();
        SpecialThread st4 = new SpecialThread();
        SpecialThread st5 = new SpecialThread();

        Thread tr1 = new Thread(st1);
        Thread tr2 = new Thread(st2);
        Thread tr3 = new Thread(st3);
        Thread tr4 = new Thread(st4);
        Thread tr5 = new Thread(st5);

        list.add(tr1);
        list.add(tr2);
        list.add(tr3);
        list.add(tr4);
        list.add(tr5);

        //в условии нет, но мы должны запустить же!
        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr5.start();
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
