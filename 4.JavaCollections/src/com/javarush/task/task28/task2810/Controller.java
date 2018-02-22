package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.model.Strategy;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AndrewUkraine on 20.11.2017.
 */
public class Controller {

    Model model;


    public Controller(Model model) {

        if (model == null )
            throw new IllegalArgumentException();
            this.model =model;

        }

  public   void onCitySelect(String cityName){
model.selectCity(cityName);
    }





    }


