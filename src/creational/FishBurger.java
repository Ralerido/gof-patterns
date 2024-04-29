package creational;

public class FishBurger extends Burger {
    private String fishType;
    private boolean hasTartarSauce;

    public FishBurger(double price, int calories, String fishType, boolean hasTartarSauce) {
        super(price, calories, "fish");
        this.fishType = fishType;
        this.hasTartarSauce = hasTartarSauce;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Fish Type: " + fishType + ", Tartar Sauce: " + hasTartarSauce);
    }
}
