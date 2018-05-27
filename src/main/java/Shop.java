import Items.Item;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addItemToStock(Item item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(Item item) {
        this.stock.remove(item);
    }
}
