package org.academiadecodigo.argicultores.World;

import org.academiadecodigo.argicultores.Movement.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class GameObject {
    private Position pos;
    private Rectangle rectangle;

    public GameObject(int x, int y) {
        pos = new Position(x,y);
        rectangle = new Rectangle(x,y,20,20);
    }

    public void fill(){
        rectangle.fill();
    }

    public int getPos(){
        int pixel = pos.getX() + (pos.getY() * 600) - pos.getY();
        return pixel;
    }
}
