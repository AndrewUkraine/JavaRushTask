package com.javarush.task.task18.task1805;




import java.io.FileInputStream;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        TreeMap<Integer, Integer> list = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream (a); //принимает значение с консоли


        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            Integer k = inputStream.read();
            list.put(k,1);

            }


        for (Map.Entry e : list.entrySet())
        {
            System.out.print(e.getKey()+" ");
        }


        inputStream.close(); // закрываем поток
        scanner.close();
                }

}
