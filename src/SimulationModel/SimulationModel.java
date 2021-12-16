package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
    public class SimulationModel {
    Scene scene;
    Cell c[];
    public SimulationModel() {
        c = new Cell[10];
        for (int i = 0; i < 10; i++){
            c[i] = new Cell((10),(int)(Math.random()*40));

        }
    }
    public void update() {
        for (int i = 0; i < 10; i++) {

            c[i].update();
        }
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            shapes.add(c[i].getShape());
        }
        return shapes;
    }


}