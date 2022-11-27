import Instruments.Woodwind;
import Instruments.WoodwindType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Woodwind saxophone;
    Woodwind clarinet;
    Woodwind oboe;

    @Before
    public void before(){
        saxophone = new Woodwind(WoodwindType.SAXOPHONE, "Woodwind", 250, 500);
        clarinet = new Woodwind(WoodwindType.CLARINET, "Woodwind", 200, 450);
        oboe = new Woodwind(WoodwindType.OBOE, "Woodwind", 350, 600);
    }

    @Test
    public void canGetWoodwindType(){
        assertEquals(WoodwindType.SAXOPHONE, saxophone.getWoodwindType());
        assertEquals(WoodwindType.CLARINET, clarinet.getWoodwindType());
        assertEquals(WoodwindType.OBOE, oboe.getWoodwindType());
    }


    @Test
    public void canGetReedType(){
        assertEquals("Single", saxophone.getReedType());
        assertEquals("Single", clarinet.getReedType());
        assertEquals("Double", oboe.getReedType());
    }

    @Test
    public void canGetWoodwindSound(){
        assertEquals("Woodwind sound", saxophone.play());
    }

    @Test
    public void canGetMarkupOnWoodwindTypes(){
        assertEquals(250, saxophone.calculateMarkup());
        assertEquals(250, clarinet.calculateMarkup());
        assertEquals(250, oboe.calculateMarkup());
    }




}
