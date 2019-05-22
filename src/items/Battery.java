package items;

import items.camera.Manufacturer;

/**
 * Батарейка
 */
public class Battery extends Item<Battery> {

    private Manufacturer manufacturer;

    public Battery(String name, int price, int byingPrice, Manufacturer manufacturer) {
        super(name, price, byingPrice);
        this.manufacturer = manufacturer;
    }

    @Override
    public int getTaxes() {
        return 0;
    }

    @Override
    public Battery storage() {
        System.out.println("Я хранюсь пачками");
        return this;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

}

