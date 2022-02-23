package org.academiadecodigo.argicultores.World;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private Rectangle pixel;
    private boolean filled = false;

    public Cell(int x, int y, int width, int height){
        pixel = new Rectangle(x,y,width,height);
    }

    public void draw(){
        pixel.draw();
    }

    public void fill() {
        pixel.fill();
    }

    public int getX() {
       return pixel.getX();
    };

    public int getY() {
        return pixel.getY();
    }



}
