package com.javarush.task.task10.task1002;

/* 
Задача №2 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a =  15;
        int b = 4;
        float c = (float) a /  b;
        double d =  a  * 1e-3 + c; //  15* 0.001

        System.out.println(d);
    }
}
