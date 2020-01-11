import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    @Before
    public void before(){
        flight = new Flight(plane, "OK200", "London", "ED", "0900");

    }
}
