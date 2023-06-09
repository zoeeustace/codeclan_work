import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Passenger passenger;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight("W64493", "LIS", "LTN", "18:25",plane);
        pilot = new Pilot("Terrence", "Captain", "PK7643");
        passenger = new Passenger("Zoe", 1);
        cabinCrew1 = new CabinCrew("Scott", CabinCrewRank.CHIEF_PURSER);
        cabinCrew2 = new CabinCrew("Jamie", CabinCrewRank.SENIOR_CREW_MEMBER);
        cabinCrew3 = new CabinCrew("Richard", CabinCrewRank.FLIGHT_ATTENDANT);
        plane = new Plane(PlaneType.CESSNA_CARAVAN);
    }

    @Test
    public void returnPilot(){
        flight.addPilot(pilot);
        assertEquals(1, flight.getPilots().size());
    }

    @Test
    public void addCabinCrewToFlight(){
        flight.addCabinCrew(cabinCrew1);
        flight.addCabinCrew(cabinCrew2);
        flight.addCabinCrew(cabinCrew3);
        assertEquals(3, flight.getCabinCrews().size());
    }

    @Test
    public void addPassengersToFlight(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void checkCapacity(){
        flight.addPassenger(passenger);
        assertEquals(13, flight.getAvailableSeats(plane));
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        assertEquals(4, flight.getPassengers().size());
    }

    @Test
    public void cantBookPassenger(){
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger, plane);
        assertEquals(14, flight.getPassengers().size());
    }
}
