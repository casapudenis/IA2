public class Circle implements Shape {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}