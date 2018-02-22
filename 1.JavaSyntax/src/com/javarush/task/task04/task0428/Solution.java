package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());


        if (a>=0)
            a=1; else a=0;
        if (b>=0)
            b=1; else b=0;
        if (c>=0)
            c=1; else c=0;
            System.out.println (a+b+c);


    }
}
