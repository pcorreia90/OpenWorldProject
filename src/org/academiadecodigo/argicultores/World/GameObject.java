package org.academiadecodigo.argicultores.World;

import org.academiadecodigo.argicultores.Movement.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class GameObject {
    private Position pos;
    private Rectangle rectangle;

    public GameObject(int x, int y) {
        pos = new Position(x,y);
        rectangle = new Rectangle(x,y,40,100);
    }

    public void fill(){
        rectangle.fill();
    }

    public int getX() {
        return pos.getX();
    }

    public int getY() {
        return pos.getY();
    }

    public int xPlusWidth() {
        return pos.getX() + rectangle.getWidth();

    }

    public int xPlusWidthPlusHeight (){
        return pos.getX() + rectangle.getWidth() + rectangle.getHeight();
    }

    public int yPlusHeight() {
        return getY() + rectangle.getHeight();
    }

}
