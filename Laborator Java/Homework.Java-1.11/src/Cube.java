public class Cube extends Shape3D{
    private String color;
    private double sideLength;

    public Cube(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getVolume() {
        return sideLength * sideLength * sideLength;
    }

    public double getArea() {
        return 6 * sideLength * sideLength;
    }
}
