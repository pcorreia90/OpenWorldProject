import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.security.Key;


public class World {
    private Rectangle world;
    private Player p1;

    public World() {
        world = new Rectangle(10,10,600,600);
        world.draw();
        p1 = new Player(300,300,20,20);
        p1.fill();
    }

}
