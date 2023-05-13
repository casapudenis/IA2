public class Sphere extends Shape3D{
    private String color;
    private double radius;

    public Sphere(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }
}
