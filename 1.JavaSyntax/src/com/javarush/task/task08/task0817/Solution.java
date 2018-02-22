package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя4");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия6", "Имя6");
        map.put("Фамилия7", "Имя7");
        map.put("Фамилия8", "Имя8");
        map.put("Фамилия9", "Имя10");
        map.put("Фамилия10", "Имя10");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            if (pair.getValue().equals(pair.getValue())){
                map.remove(pair.getKey());

        }
        }
    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
