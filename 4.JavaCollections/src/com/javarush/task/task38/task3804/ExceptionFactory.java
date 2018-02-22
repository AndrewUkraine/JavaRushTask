package com.javarush.task.task38.task3804;

/**
 * Created by AndrewUkraine on 15.11.2017.
 */
 class ExceptionFactory {
    public static Throwable getException(Enum type) {
        if (type == null)
            return new IllegalArgumentException();

        String massage = type.name().charAt(0) + type.name().substring(1).toLowerCase().replace("_", " ");

        if (type instanceof ExceptionApplicationMessage)
            return new Exception(massage);


        if (type instanceof ExceptionDBMessage)
            return new RuntimeException(massage);

        if (type instanceof ExceptionUserMessage)
            return new Error(massage);
            else return new IllegalArgumentException();


    }
}

