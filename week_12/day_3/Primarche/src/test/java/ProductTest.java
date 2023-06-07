import main.Electrical.Fridge;
import main.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ProductTest {

    Product product;
    Fridge fridge;

    @Before
    public void before(){
        fridge = new Fridge(1000.00, 2500.00, "Samsung", 2353,
                "GigaFridge 9000", 900, 5, 1, true);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Samsung", fridge.getManufacturer());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1500.00, fridge.calculateMarkUp(), 0.0);
    }

    @Test
    public void canTurnFridgeOn(){
        assertEquals("Getting chilly", fridge.turnOn());
    }
}
