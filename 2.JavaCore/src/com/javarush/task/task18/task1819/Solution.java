package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream f2 = new FileInputStream(fileName2);
        FileInputStream f1 = new FileInputStream(fileName1);
        ArrayList<Integer> list = new ArrayList<>();


        while (f2.available() > 0) {
           list.add(f2.read());
        }

        while (f1.available() > 0) {
            list.add(f1.read());
        }

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);

        for (int x : list)
        {
            fileOutputStream.write(x);
        }




        reader.close();
        f2.close();
        f1.close();
        fileOutputStream.close();

    }



}