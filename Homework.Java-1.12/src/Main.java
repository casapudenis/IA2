import java.util.Scanner;

public class Main {
    static void Division(int x)
    {
        int b;
        try {
            b = 10/x;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0.");
            b = 0;
            e.printStackTrace();
        }
        catch (Exception e) {
            b = -1;
            System.out.println("General error!");
            e.printStackTrace();
        }
        System.out.print("b="+b);
    }
    public static void main(String[] args) {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        Division(x);
    }
}