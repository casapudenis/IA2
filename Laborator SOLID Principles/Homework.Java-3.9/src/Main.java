public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 10);
        double circleArea = circle.computeArea();
        double squareArea = square.computeArea();
        double rectangleArea = rectangle.computeArea();
        System.out.println("Circle area:" + circleArea);
        System.out.println("Square area:" + squareArea);
        System.out.println("Rectangle area:" + rectangleArea);
    }
}