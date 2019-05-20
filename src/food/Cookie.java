package food;

import items.Item;

public class Cookie extends Item {
    public Cookie(String name, int purchasePrice) {
        super(name, purchasePrice);
    }

    @Override
    public int getTaxes() {
        return 0;
    }

    @Override
    public void store() {

    }




}
