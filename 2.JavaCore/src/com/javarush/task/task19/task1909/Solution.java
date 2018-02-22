package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        ArrayList<Character> list = new ArrayList();

        while (reader.ready()) {
            list.add((char)reader.read());
        }


            for (Character st : list) {

                if (st.equals('.'))
                    writer.write('!');
                else writer.write(st);
            }


            bufferedReader.close();
            reader.close();
            writer.close();

        }
    }
