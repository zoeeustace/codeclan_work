import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkOnceForVolume90(){
        waterbottle.drinkFromBottle();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterbottle.emptyBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillBottle(){
        waterbottle.fillBottle();
        assertEquals(100, waterbottle.getVolume());
    }
}
