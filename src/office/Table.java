package office;

import store.Storable;

/**
 * Просто стол из офиса
 */
public class Table implements Storable {

    String color;

    public Table(String color) {
        this.color = color;
    }

    String name = "Стол";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void store() {
        System.out.println("Я кладусь только ножками вверх.");
    }
}
