package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46; //46 ok
        byte c = (byte) (a * b); // 0 ok
        double f = (char) 1234.15; // 1234
        long d = (long ) (a + f / c + b); //0


        System.out.println(d);
    }
}
