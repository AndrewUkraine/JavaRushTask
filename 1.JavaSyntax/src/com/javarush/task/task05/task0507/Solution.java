package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double mid = 0;
        double d = 0;
        double i = 1;

        if (a == -1){
           a = Integer.parseInt(r.readLine());
            d = d + a;
            mid = d / i;
            i++;}
        System.out.println(mid);}}







