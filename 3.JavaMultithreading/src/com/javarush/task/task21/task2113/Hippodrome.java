package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AndrewUkraine on 21.12.2017.
 */
public class Hippodrome {

    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {


        Horse horse1 = new Horse("horse 1", 3,0);
        Horse horse2 = new Horse("horse 2", 3,0);
        Horse horse3 = new Horse("horse 3", 3,0);
        Horse horse4 = new Horse("horse 4", 3,0);
        Horse horse5 = new Horse("horse 5", 3,0);

        List<Horse> horses = new ArrayList<Horse>();


        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        horses.add(horse4);
        horses.add(horse5);


        game = new Hippodrome(horses);

        game.run();

        game.printWinner();



    }


    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public Hippodrome(List<Horse> horses) {

        this.horses = horses;
    }

//    будет управлять движением всех лошадей.
public void move(){
    horses.forEach(Horse::move);
}

//    Метод print отрисовывать их на экран.
    public void print (){
        horses.forEach(Horse::print);

        for (int i =0; i<10; i++ )
        System.out.println();

    }

//    А метод  - управлять всем этим.
    public void run () throws InterruptedException {
        int a =0;
        for (int i =0; i<10; i++ ){
          move();
            Thread.sleep(200);
          print();

        }
    }

    public Horse getWinner() {

Horse winner = horses.get(0);
        double dis = horses.get(0).getDistance();

       for (Horse horse : horses)

           if (horse.getDistance()> dis){
           dis = horse.getDistance();
           winner = horse;
           }


        return winner;
    }


    public void printWinner(){
        System.out.printf("Winner is %s!%n",getWinner().getName());

    }





}
