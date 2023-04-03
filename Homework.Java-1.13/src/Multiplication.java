import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Multiplication {

    int multiplicationWith2() {
        int x;
        try (FileReader reader = new FileReader("File")) {

            int i;
            x = 0;
            i = reader.read();
            while (i != -1) {
                x = 10 * x + (i - '0');
                i = reader.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        x*= 2;
        return x;
    }
}
