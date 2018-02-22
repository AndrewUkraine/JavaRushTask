package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String a = buff.readLine();
        int s[] = new int[3];
        for (int i = 0; i < 3; i++) {
            s[i] = Integer.parseInt(buff.readLine());
        }
        System.out.println("Меня зовут " + a + ".");
        System.out.println("Я родился " + s[2] + "." + s[1] + "." + s[0]);

    }
}
