package state;

import creational.Burger;

public class FrozenState implements BurgerState {
    @Override
    public void updateState(Burger burger) {
        System.out.println("Burger started cooking!");
        burger.setState(new CookingState());
    }
}
