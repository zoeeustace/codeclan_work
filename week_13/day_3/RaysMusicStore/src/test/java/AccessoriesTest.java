import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(10.00, 30.00, "For hitting drums", "Wood", "Pro Mark");
    }

    @Test
    public void canSellDrumsticks(){
        assertEquals(20.00, drumSticks.calculateMarkup(), 0.0);
    }
}
