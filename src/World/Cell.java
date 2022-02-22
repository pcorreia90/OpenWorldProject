package World;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private Rectangle pixel;

    public Cell(int x, int y){
        pixel = new Rectangle(x,y,10,10);
    }

    public void draw(){
        pixel.draw();
    }
}
