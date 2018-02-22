package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() throws Exception{
        Object obj = new java.util.Date();
        Integer int1 = (Integer) obj; }


    public void methodThrowsNullPointerException() throws Exception {
        Integer num = null;
       int a = 8 +num;
    }
    public static void main(String[] args) {

    }
}
