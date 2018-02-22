package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        char[] charArray = line.toCharArray();
        String vowels = "";
        String consonants = "";

        for (int i=0;i<charArray.length;i++) {
            if (isVowel(charArray[i])) {
                vowels = vowels + charArray[i]+ " ";
            }
            else if (charArray[i]==' ')  { continue;}
            else consonants = consonants + charArray[i] + " ";
        }

        System.out.println(vowels);
        System.out.println(consonants);


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}