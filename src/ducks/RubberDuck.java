package ducks;

import ducks.behaviors.FlyBehavior;
import ducks.behaviors.FlyWithRocket;
import ducks.behaviors.Mute;
import ducks.behaviors.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new Mute(), new FlyWithRocket());
    }
}
