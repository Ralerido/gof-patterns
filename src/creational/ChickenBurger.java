package creational;

public class ChickenBurger extends Burger {
    private String seasoning;
    private boolean isGrilled;

    public ChickenBurger(double price, int calories, String seasoning, boolean isGrilled) {
        super(price, calories, "chicken");
        this.seasoning = seasoning;
        this.isGrilled = isGrilled;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Seasoning: " + seasoning + ", Grilled: " + isGrilled);
    }
}
