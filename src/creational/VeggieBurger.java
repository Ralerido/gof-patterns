package creational;

public class VeggieBurger extends Burger {

    private String veggiePattyType;
    private boolean isVegan;

    public VeggieBurger(double price, int calories, String veggiePattyType, boolean isVegan) {
        super(price, calories, "veggie");
        this.veggiePattyType = veggiePattyType;
        this.isVegan = isVegan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Veggie Patty Type: " + veggiePattyType + ", Vegan: " + isVegan);
    }

}
