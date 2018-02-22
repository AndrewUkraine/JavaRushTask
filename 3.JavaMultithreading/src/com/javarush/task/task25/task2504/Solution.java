package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод

       for (Thread thread : threads){
           switch (thread.getState()){

               //Если нить еще не запущена, то запусти ее.
               case NEW:
                   thread.start();
                   break;
//Если нить в ожидании, то прерви ее.
               case WAITING:
                   thread.interrupt();
                   break;

               case RUNNABLE:
                   thread.isInterrupted();
                   break;

               case TIMED_WAITING:
                   thread.interrupt();
                   break;

               case BLOCKED:
                   thread.interrupt();
                   break;

               case TERMINATED:
                   System.out.println(thread.getPriority());
           }
       }
    }

    public static void main(String[] args) {



    }
}
