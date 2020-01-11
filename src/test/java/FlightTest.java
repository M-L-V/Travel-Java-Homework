import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane1;
    private Passenger passenger1;
    private ArrayList<Passenger> passengers;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.GHOPPER);
        passenger1 = new Passenger("Eugene", 1);
        passengers = new ArrayList<Passenger>();

        flight = new Flight(passengers, plane1, "OK200", "London", "ED", "0900");
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane1, flight.flightHasPlane());

    }

    @Test
    public void flightHasSeatsLeft(){
        assertEquals(4, flight.numOfSeats());
    }

    @Test
    public void flightStartsWithNoPassengers(){
        assertEquals(0, flight.numOfPassengers());
    }

    @Test
    public void flightCanBookPassengers(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.numOfPassengers());
    }

}
