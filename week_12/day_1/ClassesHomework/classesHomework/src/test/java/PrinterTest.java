import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(40, 20);
    }

    @Test
    public void hasPages(){
        assertEquals(40, printer.getPages());
    }

    @Test
    public void ableToPrint(){
        printer.printCopies(2,3);
        assertEquals(34, printer.getPages());
    }

    @Test
    public void unableToPrint(){
        printer.printCopies(10,5);
        assertEquals(40,printer.getPages());
    }

    @Test
    public void hasToner(){
        assertEquals(20,printer.getToner());
    }

    @Test
    public void reduceToner(){
        printer.printCopies(1,5);
        assertEquals(15,printer.getToner());
    }

}
