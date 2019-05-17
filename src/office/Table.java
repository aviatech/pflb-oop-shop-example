package office;

import store.Storagable;

/**
 * Просто стол из офиса
 */
public class Table implements Storagable {

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
    public void storage() {
        System.out.println("Я кладусь только ножками вверх.");
    }
}
