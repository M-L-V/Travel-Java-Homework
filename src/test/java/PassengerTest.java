import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before (){
       passenger1 = new Passenger("Eugene", 1);
       passenger2 = new Passenger(  "Juan", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Eugene", passenger1.getName());
    }
}
