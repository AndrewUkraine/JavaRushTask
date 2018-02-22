package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Фамилия1", 600);
        map.put("Фамилия2", 700);
        map.put("Фамилия3", 800);
        map.put("Фамилия4", 400);
        map.put("Фамилия5", 500);
        map.put("Фамилия6", 300);
        map.put("Фамилия7", 200);
        map.put("Фамилия8", 100);
        map.put("Фамилия9", 50);
        map.put("Фамилия10", 500);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());


            }
        }
    }

    public static void main(String[] args) {

    }
}