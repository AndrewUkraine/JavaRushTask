package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int a = 1; //почему иденицы?
        int b = 1;

        for (int i = 0; i < list.size()-1; i++){ //зачем тут -1 ? что делает этот цикл ?

            if (list.get(i).equals(list.get(i+1))) {  //зачем этот цикл , что именно он сравнивает? зачнм +1 ?
                b++; //это счетчик верно?
                if (a < b) a = b; // зачем это?
            }
            else b = 1; // и это?
    }
                System.out.println(b);}
            }




