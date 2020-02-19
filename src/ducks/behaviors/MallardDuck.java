package ducks.behaviors;

import ducks.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Quack(), new FlyWithWings());
    }
}
