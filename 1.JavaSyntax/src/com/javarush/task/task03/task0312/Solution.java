package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour) {
int a = hour*60*60;
return a;}


        public static void main(String[]args){
            System.out.println(convertToSeconds(1));
            System.out.println(convertToSeconds(2));

        }
    }

