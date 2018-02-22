package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {



        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream =  new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(printStream);

        String result = outputStream.toString();

        String[] resultmas = result.split("te");

        for (int i =0; i<resultmas.length; i++){
            System.out.print(resultmas[i]);
            if (i != resultmas.length-1)
                System.out.print("??");
        }
        }






    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
