public class ShapeDrawer {
    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}