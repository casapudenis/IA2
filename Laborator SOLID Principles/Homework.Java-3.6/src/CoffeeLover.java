import java.util.ArrayList;
import java.util.List;
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;
    public CoffeeLover(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }
    public void makeCoffee() {
        coffeeMachines.forEach(CoffeeMachine::start);
    }
    public static void main(String[] args) {
        List<CoffeeMachine> coffeeMachines = new ArrayList<>();
        coffeeMachines.add(new SimpleCoffeeMachine());
        coffeeMachines.add(new ComplexCoffeeMachine());
        CoffeeLover coffeeLover = new CoffeeLover(coffeeMachines);
        coffeeLover.makeCoffee();
    }
}