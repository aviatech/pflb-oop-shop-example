package office;

import store.Storagable;

/**
 * Просто стол из офиса
 */
public class Table implements Storagable<Table> {

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
    public Table storage() {
        System.out.println("Я кладусь только ножками вверх.");
        return this;
    }

    @Override
    public String toString() {
        return "Стол";
    }
}
