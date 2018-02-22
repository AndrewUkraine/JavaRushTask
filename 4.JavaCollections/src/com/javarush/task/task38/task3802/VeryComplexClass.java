package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.FileInputStream;
import java.io.IOException;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
    }

    public static void main(String[] args) {

    }
}
