package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();


        FileInputStream inputStream1 = new FileInputStream(a);
        FileOutputStream outputStream2 = new FileOutputStream(b);
        FileOutputStream outputStream3 = new FileOutputStream(c);

            while (inputStream1.available()>0){
                byte[] buffer = new byte[inputStream1.available()];
                int count = inputStream1.read(buffer);

                if (count%2==0) {
                    outputStream2.write(buffer, 0, count/2);
                    outputStream3.write(buffer, count/2, count/2);
                }

                if (count%2!=0) {
                    outputStream2.write(buffer, 0, (count/2)+1);
                    outputStream3.write(buffer, (count/2)+1, count-((count/2)+1));
                }

        }
       scanner.close();
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();

    }
}
