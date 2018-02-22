package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            double a = Double.parseDouble(r.readLine());
            double x = a % 5;
            if (x >= 0 && x < 3)
                System.out.println("зелёный");
            else if (x >= 3 && x < 4)
                System.out.println("желтый");
            else if (x >= 4 && x <= 5)
                System.out.println("красный");//напишите тут ваш код

        }
    }
