package com.javarush.task.task09.task0926;

import java.util.ArrayList;

import static javax.xml.ws.Endpoint.create;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList < int[] > list = new ArrayList < int[] > ();
        list.add(new int[]{1, 2, 3, 4, 5});
        list.add(new int[]{11, 12});
        list.add(new int[]{21, 22, 23, 24});
        list.add(new int[]{31, 32, 33, 34, 35, 36, 37});
        list.add(new int[]{});


        return list;
    }


    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
