package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());

        Date date = dateFormat.parse(a);
        String result = newDateFormat.format(date);
        System.out.println(result.toUpperCase());
    }
}



