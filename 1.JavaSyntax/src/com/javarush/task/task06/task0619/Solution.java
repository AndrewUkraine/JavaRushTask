package com.javarush.task.task06.task0619;

/* 
Три статические переменных name
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the 1st number");
        Double a = Double.parseDouble(r.readLine());
        System.out.println("Input veule");
        String b = r.readLine();
        System.out.println("Input the 2th number");
        Double c = Double.parseDouble(r.readLine());
        String d = r.readLine();

         if(b.equals("*"))

        {
            System.out.println((a * c));
        }


          if (b.equals("+"))
        {
            System.out.println((a + c));
        }

         if (b.equals("/"))
        {
            System.out.println((a / c));
        }

         if(b.equals("-"))
        {
            System.out.println((a - c));
        }

        if (b.equals("%"))
        {
            System.out.println(((a * c) / 100));
        }
        if (d.equals("0")){
            System.out.println( "gregtrhgtrhgtr" );
         }
        {

        }

    }
}
