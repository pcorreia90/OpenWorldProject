package org.academiadecodigo.argicultores;

import org.academiadecodigo.argicultores.Movement.Position;
import org.academiadecodigo.argicultores.World.GameObject;
import org.academiadecodigo.argicultores.World.World;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.argicultores.Player.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game implements KeyboardHandler {
    private World world;
    private Keyboard keyboard;
    private Player p1;
    private GameObject obstacle;
    private ArrayList<GameObject> obstacleList = new ArrayList();


    public Game(){
        world = new World();
        keyboard = new Keyboard(this);
        p1 = new Player(300,300,20,20);
        p1.fill();
        obstacle = new GameObject(400,400);
        obstacleList.add(obstacle);
        obstacle.fill();
        keyListener();
    }

   public int collisionDetector() {
       for (GameObject object : obstacleList) {
           //Collision from the left
           if (p1.xPlusWidth() == object.getX()) {
               if (p1.getY() >= object.getY() - 10  && p1.getY() <= object.yPlusHeight() - 10) {
                   System.out.println("from left");
                   return 1;
               }
           }
           //Collision from down
           if (p1.getY() == object.yPlusHeight()) {
               if (p1.getX() >= object.getX() - 10 && p1.getX() <= object.xPlusWidth() - 10) {
                   System.out.println("from Down");
                   return 2;
               }
           }
           //Collision from up
           if (p1.xPlusHeight() == object.getY()) {
               if (p1.getX() >= object.getX() - 10 && p1.getX() <= object.xPlusWidth() - 10) {
                   System.out.println("from up");
                   return 4;
               }
           }
           //Collision from the right
           if (p1.getX() == object.xPlusWidth()) {
               if (p1.getY() >= object.getY() - 10  && p1.getY() <= object.yPlusHeight() - 10) {
                   System.out.println("from right");
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

        KeyboardEvent down = new KeyboardEvent();
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(down);

        KeyboardEvent right = new KeyboardEvent();
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(left);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_UP:
                if(collisionDetector() == 2){
                    p1.moveUp(0);
                    return;
                }
                p1.moveUp(-10);
                break;
            case KeyboardEvent.KEY_DOWN:
                if(collisionDetector() == 4){
                    p1.moveDown(0);
                    return;
                }
                p1.moveDown(10);
                break;
            case KeyboardEvent.KEY_RIGHT:
                if(collisionDetector() == 1){
                    p1.moveRight(0);
                    return;
                };
                p1.moveRight(10);

                break;
            case KeyboardEvent.KEY_LEFT:
                if(collisionDetector() == 3){
                    p1.moveLeft(0);
                    return;
                }
                p1.moveLeft(-10);
                break;
        }
        System.out.println("Player xPlusWidth X: " + p1.xPlusWidth() + " Player xPlusWitdth Y " + p1.getY());

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
