package cuisine;

import creational.Burger;

public abstract class Cuisine {

    protected Burger burger;

    protected Cuisine(Burger burger) {
        this.burger = burger;
    }

    abstract void addSpecialSauce();

    public void order() {
        burger.updateState();
        addSpecialSauce();
        burger.updateState();
    }

    public Memento takeSnapshot() {
        return new Memento(this.burger);
    }

    public void restore(Memento memento) {
        this.burger = memento.getSavedBurger();
    }

    public static class Memento {
        private final Burger savedBurger;

        private Memento(Burger savedBurger) {
            this.savedBurger = savedBurger;
        }

        public Burger getSavedBurger() {
            return savedBurger;
        }
    }
}
