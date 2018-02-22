package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList();
        list.add("1st");
        list.add("2th");
        list.add("3th");
        list.add("4th");
        list.add("5th");

        System.out.println( list.size());
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));


        }

    }
}
