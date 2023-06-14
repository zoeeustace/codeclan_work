import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Sousaphone sousaphone;
    Theremin theremin;


    @Before
    public void before(){
        shop = new Shop("Wilfred's Music Emporium");
        sousaphone = new Sousaphone(500.00, 800.00, "Instrument", "Brass", "Brass", "Brass", 4, "Hornbostel–Sachs classification\t423.232");
        theremin = new Theremin(90.00, 430.00, "Electrophone", "Plastic", "Electric", "Orange");
    }

    @Test
    public void canAddItemToStock(){
        shop.addToStock(sousaphone);
        assertEquals(1, shop.getStock().size());
    }

    @Test public void canRemoveItemFromStock(){
        shop.addToStock(sousaphone);
        shop.addToStock(theremin);
        shop.removeFromStock(theremin);
        assertEquals(1, shop.getStock().size());
        System.out.println(shop.getStock());
    }

    @Test public void canCalculateTotalProfit(){
        shop.addToStock(sousaphone);
        shop.addToStock(sousaphone);
        shop.addToStock(sousaphone);
        shop.addToStock(theremin);
        assertEquals(1240.00, shop.calculateTotalProfit(),0.0);
    }
}
