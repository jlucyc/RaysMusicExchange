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
        saxophone = new Woodwind(WoodwindType.SAXOPHONE, "Woodwind");
        clarinet = new Woodwind(WoodwindType.CLARINET, "Woodwind");
        oboe = new Woodwind(WoodwindType.OBOE, "Woodwind");
    }

    @Test
    public void canGetWoodwindType(){
        assertEquals(WoodwindType.SAXOPHONE, saxophone.getWoodwindType());
        assertEquals(WoodwindType.CLARINET, clarinet.getWoodwindType());
        assertEquals(WoodwindType.OBOE, oboe.getWoodwindType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(150, saxophone.getWoodwindBuyPrice());
        assertEquals(150, clarinet.getWoodwindBuyPrice());
        assertEquals(200, oboe.getWoodwindBuyPrice());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(300, saxophone.getWoodwindSellPrice());
        assertEquals(350, clarinet.getWoodwindSellPrice());
        assertEquals(250, oboe.getWoodwindSellPrice());
    }

    @Test
    public void canGetReedType(){
        assertEquals("Single", saxophone.getReedType());
        assertEquals("Single", clarinet.getReedType());
        assertEquals("Double", oboe.getReedType());
    }




}
