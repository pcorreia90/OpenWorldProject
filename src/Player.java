import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Movable;

public class Player implements Movable {

    private Ellipse player;

    public Player(int x, int y, int width, int height) {
        player = new Ellipse(x, y, width, height);
    }

    public void fill(){
        player.fill();
    }


    @Override
    public void translate(double v, double v1) {
        player.translate(v, v1);
    }




}
