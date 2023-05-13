public class Square extends Shape2D{
    private String color;
    private double length;

    public Square(String color, double length) {
        this.color = color;
        this.length = length;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
