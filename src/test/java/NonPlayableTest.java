import Items.NonPlayable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonPlayableTest {
    NonPlayable nonPlayable;

    @Before
    public void before() {
        nonPlayable = new NonPlayable("Plectrum", 1, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Plectrum", nonPlayable.getName());
    }
}
