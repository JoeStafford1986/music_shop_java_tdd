import Items.Guitar;
import Items.Playable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayableTest {
    Playable playable;

    @Before
    public void before() {
        playable = new Guitar("Fender", "Stratocaster", 100, 200);
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", playable.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", playable.getModel());
    }
}
