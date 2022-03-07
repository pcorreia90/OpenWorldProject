package org.academiadecodigo.argicultores;


import org.academiadecodigo.argicultores.World.GameObject;
import org.academiadecodigo.argicultores.World.World;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.argicultores.Player.Player;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Game implements KeyboardHandler {
    private World world;
    private Keyboard keyboard;
    private Player p1;
    private GameObject obstacle;
    private ArrayList<GameObject> obstacleList = new ArrayList();
    private boolean pressed = false;
    private ExecutorService executor = Executors.newFixedThreadPool(1);


    public Game(){
        world = new World();
        keyboard = new Keyboard(this);
        obstacle = new GameObject(400,400);
        obstacleList.add(obstacle);
        p1 = new Player(300,300,20,20);
        keyListener();

    }

   public int collisionDetector() {
       for (GameObject object : obstacleList) {
           //Collision from the left
           if (p1.getMaxX() == object.getX()) {
               if (p1.getMaxY() > object.getY() && p1.getMaxY() <= object.yPlusHeight()) {
                   return 1;
               }
           }
           //Collision from down
           if (p1.getMaxY() > object.yPlusHeight()) {
               System.out.println("i'm here");
               if (p1.getMaxX() > object.getX() && p1.getX() < object.xPlusWidth()) {
                   System.out.println("i'm here2");
                   return 2;
               }
           }
           //Collision from up
           if (p1.getMaxY() == object.getY()) {
               if (p1.getMaxX() > object.getX() && p1.getX() < object.xPlusWidth()) {

                   return 4;
               }
           }
           //Collision from the right
           if (p1.getX() == object.xPlusWidth()) {
               if (p1.getMaxY() > object.getY() && p1.getMaxY() <= object.yPlusHeight()) {

                   return 3;
               }
           }
       }
       return 0;
   }

    public void keyListener(){
        KeyboardEvent up = new KeyboardEvent();
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        up.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(up);

        KeyboardEvent upReleased = new KeyboardEvent();
        upReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        upReleased.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(upReleased);

        KeyboardEvent down = new KeyboardEvent();
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(down);

        KeyboardEvent downRelease = new KeyboardEvent();
        downRelease.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        downRelease.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(downRelease);

        KeyboardEvent right = new KeyboardEvent();
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(left);

        KeyboardEvent leftReleased = new KeyboardEvent();
        leftReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        leftReleased.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(leftReleased);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_UP:
                    if (collisionDetector() == 2) {
                        return;
                    }
                    executor.submit(p1.moveUp());
                    break;
                case KeyboardEvent.KEY_DOWN:
                    if (collisionDetector() == 4) {
                            return;
                        }
                    executor.submit(p1.moveDown());
                    break;
                case KeyboardEvent.KEY_RIGHT:
                    if (collisionDetector() == 1) {
                        p1.moveRight(0);
                        return;
                    }
                    p1.moveRight(5);
                    pressed = false;
                    break;
                case KeyboardEvent.KEY_LEFT:
                    if (collisionDetector() == 3) {
                        return;
                    }
                    executor.submit(p1.moveLeft());
                    break;
            }
    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {;
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_DOWN:
                executor.shutdownNow();
                executor = Executors.newFixedThreadPool(1);

                case KeyboardEvent.KEY_UP:
                    executor.shutdownNow();
                    executor = Executors.newFixedThreadPool(1);

                    case KeyboardEvent.KEY_LEFT:
                        executor.shutdownNow();
                        executor = Executors.newFixedThreadPool(1);
        }
    }
}
