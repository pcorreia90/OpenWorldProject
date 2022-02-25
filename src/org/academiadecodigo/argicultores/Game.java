package org.academiadecodigo.argicultores;

import org.academiadecodigo.argicultores.Movement.Position;
import org.academiadecodigo.argicultores.World.GameObject;
import org.academiadecodigo.argicultores.World.World;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.argicultores.Player.Player;

import java.util.HashMap;

public class Game implements KeyboardHandler {
    private World world;
    private Keyboard keyboard;
    private Player p1;
    private GameObject obstacle;
    private GameObject obstacle2;
    private HashMap<Position, GameObject> obstacleList = new HashMap();


    public Game(){
        world = new World();
        keyboard = new Keyboard(this);
        p1 = new Player(300,300,20,20);
        p1.fill();
        obstacle = new GameObject(400,400);
        obstacle2 = new GameObject(400,300);
        obstacleList.put(obstacle.getPos(),obstacle);
        obstacleList.put(obstacle2.getPos(), obstacle2);
        obstacle.fill();
        obstacle2.fill();
        keyListener();
    }

    public int collisionDetector() {
        if (!obstacleList.containsKey(p1.getX() + 20)){
            return -1;
        }
        //Collision from the left
        if(p1.getX() + 20 == obstacleList.get(p1.getX() + 20).getX() && p1.getY() == obstacleList.get(p1.getX() + 20).getY() - 10 || p1.getX() + 20 == obstacleList.get(p1.getX() + 20).getX() && p1.getY() == obstacleList.get(p1.getX() + 20).getY() || p1.getX() + 20 == obstacleList.get(p1.getX() + 20).getX() && p1.getY() == obstacleList.get(p1.getX() + 20).getY() + 10) {
            return 1;
        //Collision from down
        } else if (p1.getX() == obstacle.getX() && p1.getY() - 20 == obstacle.getY() || p1.getX() == obstacle.getX() - 10 && p1.getY() - 20 == obstacle.getY() || p1.getX() == obstacle.getX() + 10 && p1.getY() - 20 == obstacle.getY()) {
            return 2;
        //Collision from right
        } else if (p1.getX() - 20 == obstacle.getX() && p1.getY() == obstacle.getY() - 10 || p1.getX() - 20 == obstacle.getX() && p1.getY() == obstacle.getY() || p1.getX() - 20 == obstacle.getX() && p1.getY() == obstacle.getY() + 10) {
            return 3;
        //Collision from up
        } else if (p1.getX() == obstacle.getX() && p1.getY() + 20 == obstacle.getY() || p1.getX() == obstacle.getX() - 10 && p1.getY() + 20 == obstacle.getY() || p1.getX() == obstacle.getX() + 10 && p1.getY() + 20 == obstacle.getY()) {
            return 4;
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
        System.out.println(p1.getX());
        System.out.println(obstacle.getX());
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
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
