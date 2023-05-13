public class Keyboard {
    String layout = "US";
    String color = "black";
    boolean has_LEDs = true;
    int keys_number = 84;

    public String toString()
    {
        return "Layout:"+layout+"\nColor:"+color+"\nIlluminated keys:"+has_LEDs+"\nKeys number:"+keys_number;
    }
}
