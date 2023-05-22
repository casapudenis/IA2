public class ShapeFactory {
    public static Shape createShape(String shape, float... dimensions) {
        if (shape.equalsIgnoreCase("rectangle") && dimensions.length == 2) {
            return new Rectangle(dimensions[0], dimensions[1]);
        } else if (shape.equalsIgnoreCase("circle") && dimensions.length == 1) {
            return new Circle(dimensions[0]);
        }
        return null;
    }
}