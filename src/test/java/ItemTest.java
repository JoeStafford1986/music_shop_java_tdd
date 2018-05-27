import Items.Item;
import Items.NonPlayable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item item;

    @Before
    public void before() {
        item = new NonPlayable("Plectrum", 1, 2);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1, item.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2, item.getSellPrice());
    }

}
