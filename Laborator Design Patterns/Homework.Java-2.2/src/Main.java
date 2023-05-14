import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        C1 c1 = new C1(scanner.nextInt(),scanner.nextInt());
        System.out.println(c1.getSum());
        C2 c2 = new C2("{\"n1\": 15, \"n2\": 22}");
        C1 instanceOfC1 = new C1Adapter(c2);
        System.out.println(instanceOfC1.getSum());
    }
}