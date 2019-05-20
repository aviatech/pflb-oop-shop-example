package items;

/**
 * Батарейка
 */
public class Battery extends Item {

    public Battery(String name, int price, int byingPrice) {
        super(name, price, byingPrice);
    }

    @Override
    public int getTaxes() {
        return 0;
    }

    @Override
    public void store() {
        System.out.println("Я хранюсь пачками");
    }
}
