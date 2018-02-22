package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(a); //принимает значение с консоли


        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int symbol = inputStream.read();
            if (map.containsKey(symbol)) {
                int count = map.get(symbol);
                map.put(symbol, ++count);
            }

            else map.put(symbol, 1);
        }
        inputStream.close(); // закрываем поток
scanner.close();


        if (map.size() <= 0){
            return;
        }
        else {

            int max = Collections.max(map.values());

            for (HashMap.Entry<Integer, Integer> pair : map.entrySet()){
                if (pair.getValue() == max){
                    System.out.print(pair.getKey() + " ");
                }
            }
        }
    }
}