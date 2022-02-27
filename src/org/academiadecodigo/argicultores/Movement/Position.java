package org.academiadecodigo.argicultores.Movement;

public class Position {
    private int x;
    private int y;
    private int xPlusWidth;
    private int xPlusWidthPlusHeight;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPos(int x, int y) {
        this.x += x;
        this.y += y;
        this.xPlusWidth += x;
    }
}
