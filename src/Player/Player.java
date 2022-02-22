package Player;

import Movement.Controller;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import Movement.Position;

public class Player implements Movable {
    private Controller controller;
    private Ellipse player;
    private Position pos;

    public Player(int x, int y, int width, int height) {
        player = new Ellipse(x, y, width, height);
        controller = new Controller(this);
        controller.keyListener();
        pos = new Position(x,y);
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

    @Override
    public void translate(double v, double v1) {

    }
}
