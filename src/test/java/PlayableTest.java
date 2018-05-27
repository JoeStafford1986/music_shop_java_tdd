import Enums.InstrumentType;
import Items.Guitar;
import Items.Playable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayableTest {
    Playable playable;

    @Before
    public void before() {
        playable = new Guitar("Fender", "Stratocaster", InstrumentType.GUITAR, 100, 200);
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", playable.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", playable.getModel());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.GUITAR, playable.getInstrumentType());
    }
}
