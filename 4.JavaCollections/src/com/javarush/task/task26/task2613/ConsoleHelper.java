package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;


public class ConsoleHelper {

    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".common_en");

    public static void writeMessage(String s) {
        System.out.println(s);
    }

    /*public static void printAvailableOperation() {
        writeMessage("operation.INFO");
        writeMessage("operation.DEPOSIT");
        writeMessage("operation.WITHDRAW");
        writeMessage("operation.EXIT");
    }*/

    public static Operation askOperation() throws InterruptOperationException {
        do {
            writeMessage( res.getString("operation.INFO") + ": 1;\n" +
                    res.getString("operation.DEPOSIT") + ": 2;\n" +
                    res.getString("operation.WITHDRAW") + ": 3;\n" +
                    res.getString("operation.EXIT") + ": 4\n");
            try {
                String input = readString();
                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(input));
            } catch (IllegalArgumentException e) {
                writeMessage("You input wrong! Try Again.");
                continue;
            }
        } while (true);
    }

    public static String readString() throws InterruptOperationException {
        String result = "";
        try {
            result = bis.readLine();
            if (result.equalsIgnoreCase("EXIT")) {
                throw new InterruptOperationException();
            }
        } catch (IOException e) {
        }
        return result;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String test;
        while (true) {
            writeMessage("choose.currency.code");
            test = readString();
            if (test.length() == 3)
                break;
            writeMessage("invalid.data");
        }
        test = test.toUpperCase();
        return test;
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] array;
        while (true) {
            ConsoleHelper.writeMessage("choose.denomination.and.count.format");
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try {
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            } catch (Exception e) {
                writeMessage("invalid.data");
                continue;
            }
            if (k <= 0 || l <= 0 || array.length > 2) {
                writeMessage("invalid.data");
                continue;
            }
            break;
        }
        return array;
    }

    public static void printExitMessage() {
        ConsoleHelper.writeMessage("the.end");
    }
}









