package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url = br.readLine();
//substring
// Вы можете извлечь подстроку из объекта String, используя метод sub­string. Этот метод создает новую копию символов из того диапазона ин­дексов оригинальной строки, который вы указали при
// вызове. Можно указать только индекс первого символа нужной подстроки — тогда будут скопированы все символы, начиная с указанного и до конца строки.
// Также можно указать и начальный, и конечный индексы — при этом в новую строку будут скопированы все символы, начиная с первого ука­занного, и до (но не включая его) символа,
// заданного конечным индек­сом.
//  "Hello World".substring(6) -> "World"
// substring(int beginIndex) Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент
// public int indexOf(int ch) — возвращает индекс в данной строке первого вхождения указанного символа или -1, если символ не встречается.

        String substring = url.substring(+1);
        ArrayList<String> list = new ArrayList<>();
        String value = "";




       // if (url.substring('?')) {
        //  double d = Double.parseDouble(a);
         //  alert(d);
        }

  //  }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
