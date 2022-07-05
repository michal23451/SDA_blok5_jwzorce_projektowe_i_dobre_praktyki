package pl.sda.java.designPatterns.structural.facade;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ShapesDrawer {
    private Shape circle;
    private Shape square;

    public ShapesDrawer() {
        circle = new Circle();
        square = new Square();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }

    public String drawShapes() {
        List<String> drawers = Arrays.asList(
                circle.draw(),
                square.draw()
    };
    return
}
