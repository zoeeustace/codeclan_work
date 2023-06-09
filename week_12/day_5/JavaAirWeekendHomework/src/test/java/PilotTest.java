import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Terrence", "Captain", "PK7643");
    }

    @Test
    public void getPilotName(){
        assertEquals("Terrence", pilot.getName());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Weeeeeee!", pilot.flyPlane());
    }

}
