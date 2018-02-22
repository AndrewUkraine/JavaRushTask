package com.javarush.task.task37.task3712;

/**
 * Created by AndrewUkraine on 14.11.2017.
 */
public abstract class Game {

   abstract void prepareForTheGame();
    abstract void playGame ();
    abstract void  congratulateWinner();

   public void run (){
       prepareForTheGame();
       playGame();
       congratulateWinner();
   }
}
