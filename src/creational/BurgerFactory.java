package creational;

public class BurgerFactory {
    public static Burger createBurger(String type) {
        return switch (type.toLowerCase()) {
            case "veggie" -> new VeggieBurger(5.99, 350, "Black Bean", true);
            case "chicken" -> new ChickenBurger(6.99, 500, "Normal", true);
            case "fish" -> new FishBurger(7.99, 450, "Cod", true);
            default -> new ChickenBurger(6.99, 500, "Normal", false);
        };
    }
}
