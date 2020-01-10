import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;


    @Before
    public void before(){
        plane = new Plane(PlaneType.GHOPPER);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.GHOPPER, plane.getPlaneType());
    }


}
