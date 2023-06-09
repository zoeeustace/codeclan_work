import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Pilot> pilots;
    private List<CabinCrew> cabinCrews;
    private List<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, Plane plane) {
        this.pilots = new ArrayList<>();
        this.cabinCrews = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<CabinCrew> getCabinCrews() {
        return cabinCrews;
    }

    public void setCabinCrews(List<CabinCrew> cabinCrews) {
        this.cabinCrews = cabinCrews;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }

    public void addCabinCrew(CabinCrew cabinCrew){
        cabinCrews.add(cabinCrew);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public int getAvailableSeats(Plane plane){
        int numberOfPassengers = passengers.size();
        int planeTypeCapacity = plane.getPlaneTypeCapacity();
        int remainingCapacity = planeTypeCapacity - numberOfPassengers;
        return remainingCapacity;

    }

    public String bookPassenger(Passenger passenger, Plane plane){
        if(getAvailableSeats(plane) > 0){
            passengers.add(passenger);
            return "You're booked on";
        } else {
            return "Flight's full, loser!";
        }
    }
}
