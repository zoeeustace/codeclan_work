import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Stephanie", CabinCrewRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Chicken or beef?", cabinCrew.relayMessages());
    }
}
