package polymorphism2;

public class DrawableCircle extends Circle implements Drawable {
    DrawableCircle(double r) {
        super();
    }
    public void draw() {

        System.out.println("Drawing a circle with radius");
    }
}
