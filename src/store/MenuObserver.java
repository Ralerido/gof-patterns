package store;

public class MenuObserver implements Observer {
    @Override
    public void update(String burgerType) {
        System.out.println("New Burger added to the menu: " + burgerType);
    }
}
