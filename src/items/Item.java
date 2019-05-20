package items;

import store.Storable;

/**
 * Абстрактный продающийся продукт
 */
public abstract class Item implements Storable {

    private int price; // цена продажи
    private int purchasePrice; // цена покупки
    private String name;
    private String taxClass;

    public Item(String name, int price, int purchasePrice, String taxClass) {
        this.price = price;
        this.purchasePrice = purchasePrice;
        this.name = name;
        this.taxClass = taxClass;
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

    public int getTaxes() {
        if (getTaxClass().equals("1")) {
            return 10;
        }
        if (getTaxClass().equals("2")) {
            return 5;
        }
        return 0;
    }

    public abstract String getTaxClass();

}
