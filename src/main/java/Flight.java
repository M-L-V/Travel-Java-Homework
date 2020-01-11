import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String airport;
    private String departureTime;

    public Flight (ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String airport, String departureTime) {

        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.departureTime = departureTime;
    }


    public Plane flightHasPlane() {
        return this.plane;
    }

    public int numOfSeats() {
        return this.plane.getSeats();
    }

    public int numOfPassengers(){
        return passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
