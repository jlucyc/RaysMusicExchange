import Instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone(0, "Brass", 250, 350);
    }

    @Test
    public void canGetNoOfButtons(){
        assertEquals(0, trombone.getButtons());
    }

    @Test
    public void canPlayTrombone(){
        assertEquals("Trombone sound", trombone.play());
    }

    @Test
    public void canGetMarkupOnTrombone(){
        assertEquals(100, trombone.calculateMarkup());
    }
}
