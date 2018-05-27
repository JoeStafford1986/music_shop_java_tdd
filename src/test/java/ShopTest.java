import Items.Guitar;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Item guitar;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Fender", "Stratocaster", 100,200);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }
}
