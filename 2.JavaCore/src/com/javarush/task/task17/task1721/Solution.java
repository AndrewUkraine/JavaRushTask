package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();


        try {
            BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));

                while (file1.ready()) {
                    allLines.add(file1.readLine());
                }

                file1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        try {
            BufferedReader file2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));

            while (file2.ready()) {
                forRemoveLines.add(file2.readLine());
            }
            file2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Что-то");
        }
    }


    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else allLines.clear();
        throw new CorruptedDataException();


    }
    }

