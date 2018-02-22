package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException {

        String[] list = {"A7RUTRR", "ENUAEW9", "HDM7CLR", "PVXES6G", "A4JY5V1"};


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (String aList : list) {
            if (name.equals(aList))
            {System.out.print(name + " - введен коректный код!");
                break;}

            if (!name.equals(aList)) {
                System.out.print(name + " - введен НЕ коректный код!");}
            break;}
    }
}






















