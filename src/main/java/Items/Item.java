package Items;

import Interfaces.ISell;

public abstract class Item implements ISell {
    private int buyPrice;
    private int sellPrice;

    public Item(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
