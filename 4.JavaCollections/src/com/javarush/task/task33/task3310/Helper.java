package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by AndrewUkraine on 07.11.2017.
 */
public class Helper {


    public static String generateRandomString(){
        SecureRandom secureRandom = new SecureRandom();
        return new BigInteger(130, new SecureRandom()).toString(32);
    }

   public static void printMessage(String message){
        System.out.println(message);
    }
}
