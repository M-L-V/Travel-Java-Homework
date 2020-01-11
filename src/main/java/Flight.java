import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String airport;
    private String departureTime;

    public Flight (Plane plane, String flightNumber, String destination, String airport, String departureTime) {

        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.GHOPPER);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.departureTime = departureTime;
    }

}
