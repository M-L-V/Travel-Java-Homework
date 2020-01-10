import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String airport;
    private String departureTime;

    public Flight (){
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.GHOPPER);
        this.flightNumber = "FR756";
        this.destination = "LON";
        this.airport = "EDINBURGH";
        this.departureTime = "0900";





    }

}
