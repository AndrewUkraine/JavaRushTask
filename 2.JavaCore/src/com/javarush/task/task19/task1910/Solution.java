package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        ArrayList<String> list = new ArrayList();

        while (reader.ready()) {
            list.add(reader.readLine());
        }


        for (String st : list) {

           writer.write(st.replaceAll("[\\p{Punct}|\\n]",""));



        }


        bufferedReader.close();
        reader.close();
        writer.close();

    }
}