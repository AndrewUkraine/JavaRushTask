package com.javarush.task.task17.task1707;

/**
 * Created by AndrewUkraine on 08.08.2017.
 */
public  class VolatileDemo implements Runnable
{
    private boolean isCancel = false;

    public void cancel()
    {
        this.isCancel = true;
    }

    public void run()
    {
        while (!this.isCancel)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");
        }
    }
}