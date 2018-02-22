package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

        public class Solution {
            public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int  a [] = new int [20];
                int  b [] = new int [10];
                int  c [] = new int [10];

                for (int i = 0; i < a.length; i++){
                    a [i] = Integer.parseInt(reader.readLine());}   // всем этим блоком обозначили что нужно вводить 20 чисел м length можно было на 20 заменить
                for (int i = 0; i < 10; i++) {

                    b[i] = a[i];
                    c[i] = a[i + 10];


                    System.out.println(c[i]);
                }

            }






    }

