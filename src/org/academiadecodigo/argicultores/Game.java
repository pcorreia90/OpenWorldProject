package org.academiadecodigo.argicultores;

import org.academiadecodigo.argicultores.World.Obstacle;
import org.academiadecodigo.argicultores.World.World;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.argicultores.Player.Player;

public class Game implements KeyboardHandler {
    private World world;
    private Keyboard keyboard;
    private Player p1;
    private Obstacle obstacle;

    public Game(){
        world = new World();
        keyboard = new Keyboard(this);
        p1 = new Player(300,300,20,20);
        p1.fill();
        obstacle = new Obstacle(400,400);
        obstacle.fill();
        keyListener();
    }

    public void colisionDetector() {
        if(p1.getX() + 20 == obstacle.getX() && p1.getY() >= obstacle.getY() - 10){
            p1.moveRight(0);
        }
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
                if(p1.getX() == obstacle.getX() && p1.getY() - 20 == obstacle.getY()){
                    return;
                }
                p1.moveUp(-10);
                break;
            case KeyboardEvent.KEY_DOWN:
                if(p1.getX() == obstacle.getX() && p1.getY() + 20 == obstacle.getY()){
                    return;
                }
                p1.moveDown(10);
                break;
            case KeyboardEvent.KEY_RIGHT:
                colisionDetector();
                p1.moveRight(10);
                break;
            case KeyboardEvent.KEY_LEFT:
                if(p1.getX() - 20 == obstacle.getX() && p1.getY() == obstacle.getY()){
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
