package com.javarush.task.task37.task3710.decorators;

import com.javarush.task.task37.task3710.shapes.Shape;
import com.sun.javafx.binding.StringFormatter;

/**
 * Created by AndrewUkraine on 14.11.2017.
 */
public class RedShapeDecorator extends ShapeDecorator {
    private Shape shape;


    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        this.shape = decoratedShape;
    }

    private void setBorderColor(Shape decoratedShape) {
        System.out.println(String.format("Setting border color for %s to red.", decoratedShape.getClass().getSimpleName()));
    }

    @Override
    public void draw() {
        setBorderColor(shape);
        super.draw();

    }
}
