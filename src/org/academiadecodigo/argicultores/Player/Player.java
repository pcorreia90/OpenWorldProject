package org.academiadecodigo.argicultores.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.argicultores.Movement.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Player implements Movable, Runnable {
    private Picture player;
    private Position pos;
    private MoveDown moveDown = new MoveDown();
    private MoveUp moveUp = new MoveUp();
    private MoveLeft moveLeft = new MoveLeft();

    public Player(int x, int y, int width, int height) {
        player = new Picture(x, y, "resources/Player Character/Walk/Walk Down/0_Warrior_Walk_000.png");
        pos = new Position(x, y);
        player.draw();
    }

    public MoveUp moveUp() {
        player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_000.png");
        if (player.getY() <= 10) {
            return null;
        }
        return moveUp;
    }

    public MoveDown moveDown() {
        player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_000.png");
        if (player.getMaxY() >= 605) {
            return null;
        }
        return moveDown;
    }

    public MoveLeft moveLeft() {
        player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_000.png");
        if (pos.getX() <= 10) {
            return null;
        }
        return moveLeft;
    }

    public void moveRight(int x) {
        player.load("resources/Player Character/Walk/0_Warrior_Walk_Right _000.png");
        if (player.getMaxX() >= 610) {
            return;
        }
        player.translate(x, 0);
        pos.setPos(x, 0);

    }

    public int getX() {
        return pos.getX();
    }

    public int getY() {
        return pos.getY();
    }

    public int getPos() {
        int pixel = pos.getX() + (pos.getY() * 600) - pos.getY();
        return pixel;
    }

    public int getMaxX() {
        return player.getMaxX();
    }

    public int getMaxY() {
        return player.getMaxY();
    }

    public int getHeight() {
        return player.getHeight();
    }

    public int getWidth() {
        return player.getWidth();
    }


    @Override
    public void translate(double v, double v1) {

    }

    @Override
    public void run() {

    }

    public class MoveDown implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_001.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_002.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_003.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_004.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_005.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_006.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_007.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_008.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_009.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_010.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_011.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_012.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_013.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_014.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_015.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_016.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_017.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_018.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_019.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_020.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_021.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_022.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_023.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_024.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_025.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_026.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_027.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_028.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_029.png");
                player.translate(0, 1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk Down/0_Warrior_Walk_000.png");
            } catch (InterruptedException e) {

            }

        }
    }

    public class MoveUp implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_001.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_002.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_003.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_004.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_005.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_006.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_007.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_008.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_009.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_010.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_011.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_012.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_013.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_014.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_015.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_016.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_017.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_018.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_019.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_020.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_021.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_022.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_023.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_024.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_025.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_026.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_027.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_028.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_029.png");
                player.translate(0, -1);
                Thread.sleep(33);
                player.load("resources/Player Character/Walk/Walk up/0_Warrior_Walk_000.png");
            } catch (InterruptedException e) {

            }

        }
    }

    public class MoveLeft implements Runnable{

        @Override
        public void run() {
            try {
                for(int i = 0; i < 2; i++) {
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_001.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_002.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_003.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_004.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_005.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_006.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_007.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_008.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_009.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_010.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_011.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_012.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_013.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                    player.load("resources/Player Character/Walk/Walk Left/0_Warrior_Run_014.png");
                    player.translate(-1, 0);
                    Thread.sleep(33);
                }
            } catch (InterruptedException e) {

            }

        }
    }

}


