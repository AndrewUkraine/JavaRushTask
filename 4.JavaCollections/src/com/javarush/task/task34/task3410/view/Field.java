package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.EventListener;
import com.javarush.task.task34.task3410.model.*;



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;


/**
 * Created by AndrewUkraine on 13.12.2017.
 */
public class Field extends JPanel {
    View view;

    public Field(View view) {
        this.view = view;
        this.addKeyListener(new KeyHandler());
        this.setFocusable(true);

    }

    public void paint(Graphics g) {


        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);

        Set<GameObject> gameObjectSet = view.getGameObjects().getAll();

        for (GameObject gameObject : gameObjectSet) {
            gameObject.draw(g);
        }

    }



    EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public class KeyHandler extends KeyAdapter {
        private Field field;

        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case (KeyEvent.VK_LEFT):
                    eventListener.move(Direction.LEFT);
                    break;

                case (KeyEvent.VK_RIGHT):
                    eventListener.move(Direction.RIGHT);
                    break;

                case (KeyEvent.VK_DOWN):
                    eventListener.move(Direction.DOWN);
                    break;

                case (KeyEvent.VK_UP):
                    eventListener.move(Direction.UP);
                    break;

                case (KeyEvent.VK_R):
                    eventListener.restart();
                    break;


            }
        }


    }
}
