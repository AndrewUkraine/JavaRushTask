package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int b = Integer.parseInt(s);
        if (b == 1) System.out.print("понедельник");
        else if (b == 2) System.out.print("вторник");
        else if (b == 3) System.out.print("среда");
        else if (b == 4) System.out.print("четверг");
        else if (b == 5) System.out.print("пятница");
        else if (b == 6) System.out.print("суббота");
        else if (b == 7) System.out.print("воскресенье");
        else System.out.print("такого дня недели не существует"); //напишите тут ваш код } }
    }
}