import ducks.Duck;
import ducks.RubberDuck;
import ducks.behaviors.MallardDuck;
import ducks.behaviors.Quack;

public class MicroDuckSimulator {
    public static void main(String ... args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();

        rubberDuck.setQuackBehavior(new Quack());
        rubberDuck.quack();
    }
}
