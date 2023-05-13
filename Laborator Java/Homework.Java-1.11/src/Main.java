import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LineSegment lineSegment = new LineSegment("black",12);

        Square square1 = new Square("blue", 4);
        Square square2 = new Square("blue", 3);
        Square square3 = new Square("blue", 5);
        ArrayList<Square> squares=new ArrayList<>();
        squares.add(square1);
        squares.add(square2);
        squares.add(square3);

        Circle circle1 = new Circle("green",2);
        Circle circle2 = new Circle("green",1);
        ArrayList<Circle> circles=new ArrayList<>();
        circles.add(circle1);
        circles.add(circle2);

        Sphere sphere1 = new Sphere("red",3);
        Sphere sphere2 = new Sphere("red",2);
        ArrayList<Sphere> spheres = new ArrayList<>();
        spheres.add(sphere1);
        spheres.add(sphere2);

        Cube cube1 = new Cube("brown",4);
        Cube cube2 = new Cube("brown",3);
        ArrayList<Cube> cubes = new ArrayList<>();
        cubes.add(cube1);
        cubes.add(cube2);

        System.out.println("The length of the line: "+lineSegment.getPerimeter());

        double perimeter=0;
        for(int i=0;i<squares.size();i++)
            perimeter+=squares.get(i).getPerimeter();
        for(int i=0;i<circles.size();i++)
            perimeter+=circles.get(i).getPerimeter();
        System.out.println("Perimeter: "+perimeter);

        double area=0;
        for(int i=0;i<squares.size();i++)
            area+=squares.get(i).getArea();
        for(int i=0;i<circles.size();i++)
            area+=circles.get(i).getArea();
        for(int i=0;i<cubes.size();i++)
            area+=cubes.get(i).getArea();
        for(int i=0;i<spheres.size();i++)
            area+=spheres.get(i).getArea();
        System.out.println("Area: "+area);

        double volume=0;
        for(int i=0;i<cubes.size();i++)
            volume+=cubes.get(i).getVolume();
        for(int i=0;i<spheres.size();i++)
            volume+=spheres.get(i).getVolume();
        System.out.println("Volume: "+volume);

    }
}