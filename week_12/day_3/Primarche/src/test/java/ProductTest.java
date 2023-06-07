import main.Clothing.RunningShoe;
import main.Electrical.Fridge;
import main.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    Product product;
    Fridge fridge;
    RunningShoe shoe;

    @Before
    public void before(){
        fridge = new Fridge(1000.00, 2500.00, "Samsung", 2353,
                "GigaFridge 9000", 900, 5, 1, true);
        shoe = new RunningShoe(10,200,"Skechers", 3428,
                "Zoom Zoom 2000", 7, "Denim", true, true);
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

    @Test
    public void canLightUp(){
        assertTrue(shoe.isLightUp()); // can do either assert true or assert equals
    }

    @Test
    public void canSell(){
        assertEquals("Transaction Complete", fridge.sellItem(12325));
    }
}
