package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {

int a;
int b;
        for (  a = 10; a > 0; a--) { //за кол-во строк

            for (  b = a; b < 11; b++) { //за кол-во 8 в строке

                System.out.print(8);
            }
            System.out.println();
        }

    }
}
