package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();
 int N =0;
 int M=0;
        for (int i = 0; i < 2; i++) {
            int s = Integer.parseInt (reader.readLine());
            list.add(0, s);}


        for (int i = 0; i <2; i++)
            list.add(list.remove(0));
            for (int i = 0; i < list.size(); i++)
          System.out.println(list.get(i));}
    }

