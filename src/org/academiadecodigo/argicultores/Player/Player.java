package org.academiadecodigo.argicultores.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.argicultores.Movement.Position;

public class Player implements Movable {
    private Ellipse player;
    private Position pos;

    public Player(int x, int y, int width, int height) {
        player = new Ellipse(x, y, width, height);
        pos = new Position(x,y);
        fill();
        player.setColor(Color.RED);
    }

    public void fill(){
        player.fill();
    }

    public void moveUp(int y) {
        if(pos.getY() <= 10){
            return;
        }
        player.translate(0, y);
        pos.setPos(0,y);
    }

    public void moveDown(int y) {
        if(pos.getY() >= 590){
            return;
        }
        player.translate(0,y);
        pos.setPos(0,y);
    }

    public void moveLeft(int x){
        if(pos.getX() <= 10){
            return;
        }
        player.translate(x, 0);
        pos.setPos(x,0);
    }

    public void moveRight(int x) {
        if(pos.getX() >= 590){
            return;
        }
        player.translate(x,0);
        pos.setPos(x,0);

    }

    public int getX(){
        return pos.getX();
    }

    public int getY() {
        return pos.getY();
    }

    public int getPos(){
        int pixel = pos.getX() + (pos.getY() * 600) - pos.getY();
        return pixel;
    }

    public int xPlusWidth() {
        return getX() + player.getWidth();

    }

    public int xPlusWidthPlusHeight (){
        return getX() + player.getWidth() + player.getHeight();
    }

    public int xPlusHeight() {
        return getY() + player.getHeight();
    }


    @Override
    public void translate(double v, double v1) {

    }
}
