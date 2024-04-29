import creational.Burger;
import creational.BurgerFactory;
import cuisine.AmericanCuisine;
import cuisine.BurgerOrder;
import cuisine.Cuisine;
import cuisine.GermanCuisine;
import store.BurgerStore;
import store.MenuObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("CREATIONAL: Factory method");
        Burger chickenBurger = BurgerFactory.createBurger("chicken");
        Burger fishBurger = BurgerFactory.createBurger("fish");
        chickenBurger.display();
        fishBurger.display();


        System.out.println("\nBEHAVIORAL: Observer method");
        BurgerStore store = new BurgerStore();
        MenuObserver menuObserver = new MenuObserver();
        store.registerObserver(menuObserver);
        store.setBurgerType("Hot chicken");
        store.setBurgerType("Crispy fish");


        System.out.println("\nBEHAVIORAL: State method");
        chickenBurger.updateState();
        chickenBurger.updateState();
        chickenBurger.updateState();


        System.out.println("\nSTRUCTURAL: Bridge method");
        AmericanCuisine americanBurger = new AmericanCuisine(BurgerFactory.createBurger("chicken"));
        americanBurger.order();
        GermanCuisine germanBurger = new GermanCuisine(BurgerFactory.createBurger("veggie"));
        germanBurger.order();

        System.out.println("\nBEHAVIORAL: Memento method");
        BurgerOrder order = new BurgerOrder();
        order.orderBurger(americanBurger);
        order.orderBurger(germanBurger);
        System.out.println("Before undoing:");
        for (Cuisine.Memento memento : order.getOrderHistory()) {
            memento.getSavedBurger().display();
        }
        order.undoLastBurger();
        System.out.println("After undoing:");
        for (Cuisine.Memento memento : order.getOrderHistory()) {
            memento.getSavedBurger().display();
        }
    }
}