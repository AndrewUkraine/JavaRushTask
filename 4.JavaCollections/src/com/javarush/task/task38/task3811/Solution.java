package com.javarush.task.task38.task3811;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
Тикеты
*/

@Ticket (
        priority = Ticket.Priority.HIGH,
        createdBy = "Noodles",
        tags = {"bug","fix asap"}
)
public class Solution {
    public static void main(String[] args) {
        
    }


}