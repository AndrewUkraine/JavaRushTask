package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameReader.readLine())));
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        String str;
        while (reader.ready()){
            str = reader.readLine();
            if ((Integer.parseInt(str) % 2) == 0) numsList.add(Integer.parseInt(str));
        }
        Collections.sort(numsList);
        for (Integer n : numsList) {
            System.out.println(n);
        }
        reader.close();
        fileNameReader.close();
    }
}