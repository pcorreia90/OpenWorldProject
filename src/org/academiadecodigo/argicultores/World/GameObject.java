package org.academiadecodigo.argicultores.World;

import org.academiadecodigo.argicultores.Movement.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class GameObject {
    private Position pos;
    private Picture object;

    public GameObject(int x, int y) {
        pos = new Position(x,y);
        object = new Picture(x,y,"resources/building_1.png");
        object.draw();

    }


    public int getX() {
        return object.getX();
    }

    public int getY() {
        return pos.getY();
    }

    public int xPlusWidth() {
        return object.getMaxX();

    }

    public int xPlusWidthPlusHeight (){
        return object.getMaxX() + object.getMaxY();
    }

    public int yPlusHeight() {
        return object.getMaxY();
    }

}
