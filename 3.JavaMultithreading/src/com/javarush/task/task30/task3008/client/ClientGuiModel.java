package com.javarush.task.task30.task3008.client;

import java.util.*;

/**
 * Created by AndrewUkraine on 22.01.2018.
 */
public class ClientGuiModel {

    private final Set<String> allUserNames = new HashSet<String>();
    private String newMessage;

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public Set<String> getAllUserNames() {
        return Collections.unmodifiableSet(allUserNames);

    }


   public void addUser(String newUserName){
        allUserNames.add(newUserName);
    }

   public void deleteUser(String userName){
        allUserNames.remove(userName);
    }
}
