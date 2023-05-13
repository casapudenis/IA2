import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        Integer nr, sum;
        sum=0;
        int i=0;
        while(i<2)
        {
            try {
                nr = app1.readNumber();
                sum+=nr;
            } catch (InputMismatchException ex){
                i--;
                System.err.println("Value is not a number");

            }
            i++;
        }
        System.out.println("Sum:" + sum);
    }
}