package items;

import store.Storable;

/**
 * Абстрактный продающийся продукт
 */
public abstract class Item implements Storable {

    private int price; // цена продажи
    private int purchasePrice; // цена покупки
    private String name;

    public Item(String name, int price, int purchasePrice) {
        this.price = price;
        this.purchasePrice = purchasePrice;
        this.name = name;
    }

    public Item(String name, int purchasePrice) {
        this.purchasePrice = purchasePrice;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int calcProfit() {
        return getPrice() - getPurchasePrice() - getTaxes();
    }

    public String getName() {
        return name;
    }

    public abstract int getTaxes();

}
