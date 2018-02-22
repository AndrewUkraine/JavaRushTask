package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
            //System.out.println(abcArray[i]); - выводит алфавит
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
            // System.out.println(s.toLowerCase()); дублирует мои буквы
        }
        int[] alphArray = new int[alphabet.size()];
        for (String str : list) {
            char[] ch = str.toCharArray(); //дублирует что ввели но блоком
            for (char chars : ch) {
                for (int i = 0; i < alphabet.size(); i++) {
                    if (chars == (alphabet.get(i))) {
                        alphArray[i]++;
                        //     System.out.println(alphArray[i]); просто считает кол-во букв разных

                    }

                }

            }
        }
        for (int q = 0; q < alphabet.size(); q++) {
            System.out.println(alphabet.get(q) + " " + alphArray[q]);
        }
    }
}
