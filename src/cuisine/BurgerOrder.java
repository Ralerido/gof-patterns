package cuisine;

import java.util.Deque;
import java.util.LinkedList;

public class BurgerOrder {

    private Cuisine cuisineBurger;
    private Deque<Cuisine.Memento> orderHistory;

    public BurgerOrder() {
        orderHistory = new LinkedList<>();
        cuisineBurger = null;
    }

    public void orderBurger(Cuisine cuisineBurger) {
        this.cuisineBurger = cuisineBurger;
        orderHistory.add(cuisineBurger.takeSnapshot());
    }

    public void undoLastBurger() {
        cuisineBurger.restore(orderHistory.pop());
    }

    public Deque<Cuisine.Memento> getOrderHistory() {
        return orderHistory;
    }
}
