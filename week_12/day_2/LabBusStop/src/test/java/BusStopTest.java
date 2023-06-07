import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Bus Stop 23");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void addPassengerToQueue(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void removePassengerFromQueue(){
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(1, busStop.getQueueLength());
    }
}
