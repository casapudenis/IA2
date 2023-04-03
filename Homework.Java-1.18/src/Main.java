import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(7);
        numbers.add(7);
        numbers.add(9);
        numbers.add(7);


        Collections.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        } 
    }
}