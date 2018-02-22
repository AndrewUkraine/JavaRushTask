package com.javarush.task.task09.task0927;

import java.security.Key;
import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String,Cat> map = new HashMap<String, Cat>();

        map.put( "Murka", new Cat( "Murka" ) );
        map.put( "Murzik", new Cat( "Murzik" ) );
        map.put( "Vas'ka", new Cat( "Vas'ka" ) );
        map.put( "Pushok", new Cat( "Pushok" ) );
        map.put( "Bobik", new Cat( "Bobik" ) );
        map.put( "Zhuchka", new Cat( "Zhuchka" ) );
        map.put( "Koteg", new Cat( "Koteg" ) );
        map.put( "Dymka", new Cat( "Dymka" ) );
        return map;

    }

    public static Set convertMapToSet(Map map) {

        Set<Cat> set = new HashSet<Cat>();
        Iterator <Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            set.add(iterator.next().getValue());
        }

        return (Set<Cat>) set;



    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
