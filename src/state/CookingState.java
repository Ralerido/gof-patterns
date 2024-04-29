package state;

import creational.Burger;

public class CookingState implements BurgerState {
    @Override
    public void updateState(Burger burger) {
        System.out.println("Burger is ready to be served!");
        burger.setState(new ReadyState());
    }
}
