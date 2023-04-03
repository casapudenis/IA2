import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("File.txt"));
        int s=0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                s += scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        System.out.println("Sum of int numbers: "+s);
    }
}