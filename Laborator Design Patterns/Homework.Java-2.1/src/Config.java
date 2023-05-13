import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Config {
    private static Config instance;
    private String color;
    private int weight;
    private Config() {
    }
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
            instance.loadConfig();
        }
        return instance;
    }
    private void loadConfig() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("json/config.json"));
            JSONObject jsonObject = (JSONObject) obj;
            color = (String) jsonObject.get("color");
            weight = ((Long) jsonObject.get("weight")).intValue();
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
    }
    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }
}