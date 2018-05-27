import Items.Item;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addItemToStock(Item item) {
        stock.add(item);
    }
}
