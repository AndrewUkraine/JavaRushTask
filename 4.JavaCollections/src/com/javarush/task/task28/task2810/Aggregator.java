package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.HHStrategy;
import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.model.Strategy;
import com.javarush.task.task28.task2810.view.HtmlView;
import com.javarush.task.task28.task2810.view.View;

/**
 * Created by AndrewUkraine on 20.11.2017.
 */
public class Aggregator {

    public static void main (String args[]){

        Provider hhProvider = new Provider(new HHStrategy());

        HtmlView view = new HtmlView();
        Model model = new Model(view, hhProvider);
        Controller controller = new Controller(model);



        //Model model = new Model(view, hhProvider);

        view.setController(controller);
        view.userCitySelectEmulationMethod ();


    }
}
