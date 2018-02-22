package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine(); //1строка
        String fileName2 = bufferedReader.readLine(); //2 строка

        FileReader reader = new FileReader(fileName1); //считываем
        FileWriter writer = new FileWriter(fileName2);

        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()){
            int x = reader.read();
            list.add(x);
        }

        for (int i = 1; i < list.size(); i = i + 2){
            writer.write(list.get(i));
        }

        bufferedReader.close();
        reader.close();
        writer.close();
    }
}