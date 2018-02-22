package com.javarush.task.task04.task0436;


/*
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());

        for ( a = 0; a <3; a++) {
            System.out.print("сука" );
            for ( b = 1; b < 3; b++) {
                System.out.print("сука");
            }
            System.out.println();
        }
    }
}