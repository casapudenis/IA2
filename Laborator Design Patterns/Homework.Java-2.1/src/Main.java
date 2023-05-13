public class Main {
    public static void main(String[] args) {
        Config instance = Config.getInstance();
        String color = instance.getColor();
        int weight = instance.getWeight();
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}