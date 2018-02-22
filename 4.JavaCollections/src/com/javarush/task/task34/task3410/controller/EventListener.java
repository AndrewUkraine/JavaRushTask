package com.javarush.task.task34.task3410.controller;

import com.javarush.task.task34.task3410.model.Direction;

/**
 * Created by AndrewUkraine on 13.12.2017.
 */
public interface EventListener {

    //передвинуть объект в определенном направлении.
  public void move(Direction direction);

          //  – начать заново текущий уровень.
    public void restart();

//начать следующий уровень.
    public void startNextLevel() ;

    // уровень с номером level завершён.
    public void levelCompleted(int level);
}
