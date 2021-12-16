package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;

import java.awt.*;

/**
 * This is a class
 * Created 2021-11-15
 *
 * @author Magnus Silverdal
 */
public class Cell {
    private int x;
    private int y;


    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
        x++;
        if(x >39){
            x -= 39;
        }
    }

    public Sprite getSprite() {
        return null;
    }
}