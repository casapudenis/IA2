public class Main {
    public static void main(String[] args) {
        ExtensionCord prelungitor = new ExtensionCord();
        Devices device1 = new Devices("device1");
        Devices device2 = new Devices("device2");
        Devices device3 = new Devices("device3");
        prelungitor.add(device1);
        prelungitor.add(device2);
        prelungitor.add(device3);
        prelungitor.poweredUp();
    }
}