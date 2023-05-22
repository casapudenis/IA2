import java.util.ArrayList;
import java.util.List;
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;
    public CoffeeLover() {
        coffeeMachines = new ArrayList<>();
    }
    public void addCoffeeMachine(CoffeeMachine coffeeMachine) {
        coffeeMachines.add(coffeeMachine);
    }
    public void makeCoffee() {
        coffeeMachines.forEach(CoffeeMachine::start);
    }
    public static void main(String[] args) {
        CoffeeLover coffeeLover = new CoffeeLover();
        coffeeLover.addCoffeeMachine(new SimpleCoffeeMachine());
        coffeeLover.addCoffeeMachine(new ComplexCoffeeMachine());
        coffeeLover.makeCoffee();
    }
}