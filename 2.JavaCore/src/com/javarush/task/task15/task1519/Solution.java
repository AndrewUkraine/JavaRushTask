package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = "";


        while (true) {
            a = reader.readLine();
            if (a.equals("exit")){
                break;}


            try {

                if (a.contains(".")) {
                    double d = Double.parseDouble(a);
                    print(d);

                } else if (Integer.parseInt(a) > 0 && Integer.parseInt(a) < 128) {
                    short c = Short.parseShort(a);
                    print(c);
                } else if (Integer.parseInt(a) <= 0 || Integer.parseInt(a) >= 128) {
                    Integer w = Integer.parseInt(a);
                    print(w);
                }
            } catch (Exception e) {
                print(a);
            }
        }
    }










    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
