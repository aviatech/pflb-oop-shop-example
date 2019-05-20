package items.food;

import items.Item;

public class Cookie extends Item {
    public Cookie(String name, int price, int purchasePrice, String taxClass) {
        super(name, price, purchasePrice, taxClass);
    }

    public Cookie(String name, int purchasePrice) {
        super(name, purchasePrice);
    }

    @Override
    public int getTaxes() {
        return 0;
    }

    @Override
    public String getTaxClass() {
        return null;
    }

    @Override
    public void store() {

    }






}
