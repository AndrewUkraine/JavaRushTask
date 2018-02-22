package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int n = 1; n < 11; n++) {
            for (int a = 1; a < 11; a++) {
                System.out.print(a * n + " ");
            }
            System.out.println();
        }
    }
}
