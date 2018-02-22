package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] string = new String [10];
        int  a [] = new int [10];
        for (int i = 0; i < 10; i++) {
                string[i] = reader.readLine();
                a[i] = string [i].length();
                System.out.println(a[i]);
        }



    }
}
