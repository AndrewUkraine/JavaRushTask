package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader(args[0]);

        int count = 0;
        int count2 =0;

        while (f.ready())  {
            char s = (char) f.read();
            count++;

        if (s == ' ')
            count2++;
        }

        f.close();
        System.out.println(String.format("%.2f", ((float)count2/count)*100));

    }
}