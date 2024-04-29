package creational;

import state.BurgerState;
import state.FrozenState;

public abstract class Burger {

    protected double price;
    protected int calories;
    protected String type;
    protected BurgerState state;

    public Burger(double price, int calories, String type) {
        this.price = price;
        this.calories = calories;
        this.type = type;
        state = new FrozenState();
    }

    public void display() {
        System.out.println("Burger: Price = $" + price + ", Calories = " + calories);
    }

    public void updateState() {
        state.updateState(this);
    }

    public void setState(BurgerState state) {
        this.state = state;
    }

}
