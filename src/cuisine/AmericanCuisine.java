package cuisine;

import creational.Burger;

public class AmericanCuisine extends Cuisine {

    public AmericanCuisine(Burger burger) {
        super(burger);
    }

    @Override
    public void addSpecialSauce() {
        System.out.println("Adding that special american sauce!");
    }


}
