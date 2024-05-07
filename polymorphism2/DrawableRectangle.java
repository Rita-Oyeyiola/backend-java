package polymorphism2;

import java.awt.*;

public class DrawableRectangle extends Rectangle implements Drawable {
    DrawableRectangle(int l, int w) {
        super(l, w);
    }

    public void draw() {
        System.out.println("Drawing a rectangle with length");
    }

    public void drawAllShapes(Drawable[] shapes) {
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}