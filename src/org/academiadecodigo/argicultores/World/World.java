package org.academiadecodigo.argicultores.World;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class World {
    private Rectangle world;
    private Cell[] cellArea = new Cell[3600];


    public World() {
        world = new Rectangle(10,10,600,600);
        world.draw();
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
