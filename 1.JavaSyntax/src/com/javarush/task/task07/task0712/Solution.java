package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add(reader.readLine());

        int max = list.get(0).length();
        int maxi = 0;
        int mini = 0;
        int min = list.get(0).length();
        for (int i = 1; i < 10; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxi = i;
            }
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                mini = i;
            }
        }
        if (maxi > mini) System.out.println(list.get(mini));
        else System.out.println(list.get(maxi));
    }
}


