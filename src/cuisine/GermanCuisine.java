package cuisine;

import creational.Burger;

public class GermanCuisine extends Cuisine {
    public GermanCuisine(Burger burger) {
        super(burger);
    }

    @Override
    void addSpecialSauce() {
        System.out.println("Adding that special german sauce!");
    }
}
