import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class C2 {
    private JSONObject jsonData;
    public C2(String jsonStr) {
        try {
            JSONParser parser = new JSONParser();
            jsonData = (JSONObject) parser.parse(jsonStr);
        } catch (ParseException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public long getN1() {
        return (long) jsonData.get("n1");
    }
    public long getN2() {
        return (long) jsonData.get("n2");
    }
}