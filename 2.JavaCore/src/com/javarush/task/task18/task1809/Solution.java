package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String   fileName1 = reader.readLine();
            String   fileName2 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);

        while (inputStream1.available() > 0) {
            byte[] buffer = new byte[inputStream1.available()];
            for (int i = inputStream1.read(buffer); i>0; i--)
                outputStream2.write(buffer[i-1]);



        }

        reader.close();
        inputStream1.close();
        outputStream2.close();
    }
}

