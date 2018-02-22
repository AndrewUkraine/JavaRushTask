package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(a); //принимает значение с консоли
        int max = inputStream.read(); //переменная считает байты

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read();
            if (data < max)
                max = data;
        }
        inputStream.close(); // закрываем поток


        System.out.println(max); //выводим сумму на экран.
    }
}
