package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args)  {
        readData();
    }


    public static void readData() {
        ArrayList <Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            for (int v : list)
                System.out.println(v);


        }
        catch (IOException e){}
    }
}

