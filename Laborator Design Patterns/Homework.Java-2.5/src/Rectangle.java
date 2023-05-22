public class Rectangle implements Shape {
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}