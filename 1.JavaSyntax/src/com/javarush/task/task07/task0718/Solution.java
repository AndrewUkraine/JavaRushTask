package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size() - 1; i++)
            if (list.get(i + 1).length() < list.get(i).length()) {
                System.out.println(i + 1);
                break;

            }} }










