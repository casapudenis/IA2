import org.json.simple.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class EquationSolver {
    private double a;
    private double b;
    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void solveAndSaveToFile(String fileName) {
        JSONObject solutionJSON = new JSONObject();
        if (a == 0) {
            if (b == 0) {
                solutionJSON.put("solution", "infinit");
            } else {
                solutionJSON.put("solution", "imposibil");
            }
        } else {
            double x = -b / a;
            solutionJSON.put("solution", Double.toString(x));
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(solutionJSON.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
