public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Square();
        ShapeDrawer circleDrawer = new ShapeDrawer(circle);
        ShapeDrawer rectangleDrawer = new ShapeDrawer(rectangle);
        ShapeDrawer squareDrawer = new ShapeDrawer(triangle);
        circleDrawer.drawShape();
        rectangleDrawer.drawShape();
        squareDrawer.drawShape();
    }
}