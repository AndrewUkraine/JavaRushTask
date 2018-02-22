package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        StringBuilder builder = new StringBuilder();


        while (reader.ready()) {
            builder.append((char)reader.read());

        }

        String[] temp = builder.toString().split(" ");

            for (String st : temp){

                    if (st.matches("[0-9]+"))
                        writer.write(st + " ");
        }




        bufferedReader.close();
     reader.close();
     writer.close();

    }
}
