import Enums.InstrumentType;
import Items.Guitar;
import Items.Item;
import Items.NonPlayable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Item guitar;
    Item plectrum;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Fender", "Stratocaster", InstrumentType.GUITAR, 100,200);
        plectrum = new NonPlayable("Dunlop", 1, 2);
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

    @Test
    public void canAddDifferentItemTypes() {
        shop.addItemToStock(plectrum);
        shop.addItemToStock(guitar);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStockCount());
    }
}
