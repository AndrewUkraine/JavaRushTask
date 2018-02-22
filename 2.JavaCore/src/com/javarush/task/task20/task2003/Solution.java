package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            load(fileInputStream);
        }




    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод

       Properties properties2 = new Properties();
       properties2.putAll(properties);
       properties2.store(outputStream, "");


    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties properties2 = new Properties();
        properties2.load(inputStream);

        for (Map.Entry<Object, Object> entry : properties2.entrySet()) {
           properties.put((String)entry.getKey(), (String)entry.getValue());
        }
    }

    public static void main(String[] args) {

    }
}
