package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = null;


        while (true){
          String file2 = reader.readLine();

          try {
          file = new FileInputStream(file2);
          file.close(); }

          catch (FileNotFoundException e) {
              System.out.println(file2);
              reader.close();
              return;
          }



        }



    }

}
