package items;

/**
 * Батарейка
 */
public class Battery extends Item {

    public Battery(String name, int price, int byingPrice, String taxClass) {
        super(name, price, byingPrice, taxClass);
    }

    @Override
    public int getTaxes() {
        return 5;
    }

    @Override
    public void store() {
        System.out.println("Я хранюсь пачками");
    }

    @Override
    public String getTaxClass() {
        return "2";
    }
}
