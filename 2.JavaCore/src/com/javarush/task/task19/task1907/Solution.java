package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(a));
        int с = 0;
        String word = "world";


        while (bufferedReader2.ready()) {
            String line = bufferedReader2.readLine();
            String[] parts = line.toString().split("\\W");

            for (String s : parts)
                if (s.equals(word))
                    с++;


        }

        bufferedReader2.close();
        System.out.println(с);
    }
}





