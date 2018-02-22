package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(a);
int cont =0;

        while (inputStream.available() > 0)  {
         if (inputStream.read() == ','){
             cont++;
         }

            }
        System.out.println(cont);
        inputStream.close(); // закрываем поток
        scanner.close();
        }


    }
