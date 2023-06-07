import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 5);
        person = new Person();
        busStop = new BusStop("Bus Stop 23");
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.addPassenger(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.busCount());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.busCount());
    }

    @Test
    public void canNotAddMorePassengers(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.busCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.busCount());
    }

    @Test
    public void pickUpRemovesFromBusStop(){
        bus.pickUpPassengerFromStop(busStop);
        assertEquals(2, busStop.getQueueLength());
    }

    @Test
    public void pickUpAddsPassengerToBus(){
        bus.pickUpPassengerFromStop(busStop);
        assertEquals(1, bus.busCount());
    }
}
