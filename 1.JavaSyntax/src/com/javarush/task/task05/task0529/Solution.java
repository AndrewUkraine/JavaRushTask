package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        String v = "сумма";

        while (true) {
            String b = r.readLine();
            if (v.equals(b)) {
                System.out.println(a);
                break;
            }
            int x = Integer.parseInt(b);
            a = a + x;
        } }}