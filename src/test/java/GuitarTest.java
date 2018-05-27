import Enums.InstrumentType;
import Items.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Stratocaster", InstrumentType.GUITAR, 100, 200);
    }

    @Test
    public void canPlaySound() {
        assertEquals("twang twang", guitar.playSound());
    }
}
