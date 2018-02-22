package com.javarush.task.task33.task3308;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AndrewUkraine on 20.10.2017.
 */
@XmlRootElement
@XmlType(name= "shop")
public class Shop {

    static class Goods {
        public    List<String> names ;
    }

    public   Goods goods;
    public   int count;
    public     double profit;

    public   String [] secretData;
}
