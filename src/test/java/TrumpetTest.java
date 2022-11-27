import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(3, "Brass");

    }

    @Test
    public void canGetNumOfValves(){
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canGetTrumpetSound(){
        assertEquals("Trumpet sound", trumpet.play());
    }

}
