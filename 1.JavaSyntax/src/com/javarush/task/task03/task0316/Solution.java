package com.javarush.task.task03.task0316;
import java.util.ArrayList;
import java.util.Random;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {

      for (int d=0; d<40000; d++) {
          char[] chars = "9ABC4DEF6GH7JKL8MN3PQ1RST2UVWX5YZ".toCharArray();

          StringBuilder sb = new StringBuilder();

          Random random = new Random();
          for (int i = 0; i < 7; i++) {
              char c = chars[random.nextInt(chars.length)];

              sb.append(c);


          }

          System.out.println(sb);

      }





}}









