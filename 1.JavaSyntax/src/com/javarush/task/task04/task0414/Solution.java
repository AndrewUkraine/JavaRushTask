package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception { BufferedReader reader = new BufferedReader (new InputStreamReader(System.in)); int year = Integer.parseInt(reader.readLine()); System.out.println("количество дней в году: " + SearchYear(year)); } public static int SearchYear(int year){ int x1 = year % 400; int x2 = year % 100; int x3 = year % 4 ; int SY = 0; if((x3==0 && x2!=0) || x1==0) SY = 366; else SY = 365; return SY; } }