package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File myFile = new File(reader.readLine());
            BufferedWriter br = new BufferedWriter(new FileWriter(myFile));

            while (true) {

                String text = reader.readLine();
                if (!text.equals("exit")) {
                    br.write(text);
                    br.newLine();
                } else {
                    br.write(text);
                    break;
                }
            }
            reader.close();
            br.close();
        }

        catch (Exception e) {

        }
    }}
