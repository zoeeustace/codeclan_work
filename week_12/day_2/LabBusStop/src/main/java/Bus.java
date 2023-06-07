import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int busCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(passengers.size() < capacity){
            this.passengers.add(person);
        }
    }

    public void pickUpPassengerFromStop(BusStop busStop){
        if(passengers.size() < capacity){
            Person person = busStop.removePassenger();
            passengers.add(person);
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }
}
