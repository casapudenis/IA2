public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("rectangle", 2f, 10f);
        if (rectangle != null) {
            double rectangleArea = rectangle.calculateArea();
            System.out.println("Rectangle Area:" + rectangleArea);
        }
        Shape circle = ShapeFactory.createShape("circle", 3f);
        if (circle != null) {
            double circleArea = circle.calculateArea();
            System.out.println("Circle Area:" + circleArea);
        }
    }
}