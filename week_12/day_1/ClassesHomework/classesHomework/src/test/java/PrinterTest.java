import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(40);
    }

    @Test
    public void hasPages(){
        assertEquals(40, printer.getPages());
    }

    @Test
    public void printThreeCopies(){
        assertEquals(6, printer.printCopies(2, 3));
    }

//    @Test
//    public void canPrintRequiredCopies(){
//        assertEquals(true, printer.ableToPrint());
//    }
}
