package World;

import Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class World {
    private Rectangle world;
    private Player p1;
    private Cell[] cellArea = new Cell[3600];

    public World() {
        world = new Rectangle(10,10,600,600);
        world.draw();
        p1 = new Player(300,300,20,20);
        p1.fill();
        drawCells();
    }

    public void drawCells(){
        int x = 10;
        int y = 10;
        for(int i = 0; i < cellArea.length; i++){
            if(x == 610){
                x = 10;
                y += 10;
            }
            cellArea[i] = new Cell(x,y);
            cellArea[i].draw();
            x += 10;
        }
    }




}
