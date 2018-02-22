package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(5, 4, 3);
    }

    public Circle(Circle circle) {
    }

    public Circle(Circle circle1, Circle circle2) {
    }

    public Circle(Circle circle1, Circle circle2, Circle circle3) {
    }

    public Circle(Circle circle1, Circle circle2, Circle circle3, Circle circle4) {
    }
}