import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Sousaphone sousaphone;
    Theremin theremin;

    @Before
    public void before(){
        sousaphone = new Sousaphone(500.00, 800.00, "Instrument", "Brass", "Brass", "Brass", 4, "Hornbostel–Sachs classification\t423.232");
        theremin = new Theremin(90.00, 430.00, "Electrophone", "Plastic", "Electric", "Orange");
    }

    @Test
    public void canPlaySousaphone(){
        assertEquals("Toot toot", sousaphone.play());
    }

    @Test
    public void canSellSousaphone(){
        assertEquals(300.00, sousaphone.calculateMarkup(), 0.0);
    }

    @Test public void canPlayTheremin(){
        assertEquals("Wooooooooeeooo", theremin.play());
    }

    @Test public void canSellTheremin(){
        assertEquals(340.00, theremin.calculateMarkup(), 0.0);
    }
}
