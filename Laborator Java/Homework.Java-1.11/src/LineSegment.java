public class LineSegment implements Shape{

    private String color;
    private double length;

    public LineSegment(String color, double length) {
        this.color = color;
        this.length = length;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return length;
    }
}
