public class Devices {
    private String name;
    public Devices(String name){
        this.name = name;
    }
    public void pluggedIn() {
        System.out.println(name + " has been plugged in the extension cord.");
    }
}