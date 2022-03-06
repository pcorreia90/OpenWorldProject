package org.academiadecodigo.argicultores.World;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class World {
    private Rectangle world;
    private Picture floor;
    private Cell[] cellArea = new Cell[3600];


    public World() {
        world = new Rectangle(10,10,600,600);
        floor = new Picture(10,10,"resources/land_1.png");
        world.draw();
        floor.draw();
    }

    public void drawCells(){
        int x = 10;
        int y = 10;
        for(int i = 0; i < cellArea.length; i++){
            if(x == 610){
                x = 10;
                y += 10;
            }
            cellArea[i] = new Cell(x,y,10,10);
            cellArea[i].draw();
            x += 10;
        }
    }




}
