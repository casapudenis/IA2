import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = null;
        Integer b = null;
        try{
            System.out.print("First number: ");
            a=scanner.nextInt();
            System.out.print("Second number: ");
            b=scanner.nextInt();
            int s=a+b;
            System.out.println("The sum of the two numbers is: " + s);
        }
        catch(InputMismatchException e)
        {
            System.out.println("This is not a number");
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Error reading numbers!");
            e.printStackTrace();
        }


    }
}