package com.javarush.task.task22.task2213;

/**
 * Created by AndrewUkraine on 07.10.2017.
 */
public class f {

    public static void main (String[] args){
        int a=0;

        for (int i = 1; i<=100; i++) {
            if (i % 5 == 0){
            System.out.println("bazz");}

          else   if  (i % 3 == 0){
                System.out.println("foobazz");}

          else   if  (i % 5 == 0 && i % 3 == 0){
                System.out.println("foo");}

            else
                System.out.println(i);
            }


    }
}
