import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        Equation equation = new Equation();
        System.out.print("First element:");
        a = scanner.nextInt();
        System.out.print("Second element:");
        b = scanner.nextInt();
        equation.solve(a,b);
        System.out.print("Solution:");
        equation.result();
        scanner.close();
    }
}