public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Computer());
        robot.on();
        robot.off();
        robot.boot();
        robot.Move();
    }
}