import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane1;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;


    private ArrayList<Passenger> passengers;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.GHOPPER);
        passenger1 = new Passenger("Eugene", 1);
        passenger2 = new Passenger("Sandy", 1);
        passenger3 = new Passenger("Juan", 2);
        passenger4 = new Passenger("Colin", 1);
        passenger5 = new Passenger("Kat", 2);

        passengers = new ArrayList<Passenger>();

        flight = new Flight(passengers, plane1, "OK200", "London", "ED", "0900");
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane1, flight.flightHasPlane());
    }

    @Test
    public void flightHasSeats(){
        assertEquals(2, flight.numOfSeats());
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

    @Test
    public void flightDoesNotOverbook(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(2, flight.numOfPassengers());
        assertEquals(0, flight.availableSeats());
    }

    @Test
    public void flightHasSeatsLeft(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger4);
        assertEquals(0, flight.availableSeats());
        assertEquals(2, flight.numOfPassengers());
    }
}
