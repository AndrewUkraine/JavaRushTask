package com.javarush.task.task36.task3607;


import com.sun.xml.internal.fastinfoset.QualifiedName;

/*
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return QualifiedName.class;
    }
}
