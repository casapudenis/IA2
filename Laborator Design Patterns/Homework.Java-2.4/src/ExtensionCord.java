import java.util.ArrayList;

public class ExtensionCord {
    private ArrayList<Devices> devices;
    public ExtensionCord() {
        devices = new ArrayList<>();
    }
    public void add(Devices device) {
        devices.add(device);
    }
    public void poweredUp() {
        System.out.println("Extension cord is now powered up.");
        for (Devices device : devices) {
            device.pluggedIn();
        }
    }
}
