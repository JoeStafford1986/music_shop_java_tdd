import Enums.InstrumentType;
import Items.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway & Sons", "Baby Grand", InstrumentType.PIANO,25000, 35000);
    }

    @Test
    public void canPlaySound() {
        assertEquals("plink plonk", piano.playSound());
    }
}
