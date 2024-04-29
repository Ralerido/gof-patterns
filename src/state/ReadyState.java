package state;

import creational.Burger;

public class ReadyState implements BurgerState {
    @Override
    public void updateState(Burger burger) {
        System.out.println("Burger is ready to be served!");
    }
}
