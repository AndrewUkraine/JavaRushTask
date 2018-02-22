package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int c) {
        double a = c;
        double b = a + (a * 10/100);
        return b; }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
