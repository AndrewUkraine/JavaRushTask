package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/



public class Solution
{
    public static void main(String[] args) throws Exception
    {
        SimpleObject<String> stringObject = new StringObject<String>();
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }
    public static class StringObject<String>  implements SimpleObject
    {

        @Override
        public SimpleObject<String> getInstance()
        {
            return new StringObject<String>();  //To change body of implemented methods use File | Settings | File Templates.
        }


    }

}