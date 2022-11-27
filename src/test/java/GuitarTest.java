import Instruments.Guitar;
import Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar acousticGuitar;
    Guitar electricGuitar;
    Guitar bassGuitar;


    @Before
    public void before(){
        acousticGuitar = new Guitar(GuitarType.ACOUSTIC, "Wood");
        electricGuitar = new Guitar(GuitarType.ELECTRIC, "Wood");
        bassGuitar = new Guitar(GuitarType.BASS, "Wood");
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(GuitarType.ACOUSTIC, acousticGuitar.getGuitarType());
        assertEquals(GuitarType.ELECTRIC, electricGuitar.getGuitarType());
        assertEquals(GuitarType.BASS, bassGuitar.getGuitarType());
    }


    @Test
    public void canGetBuyPrice(){
        assertEquals(100, acousticGuitar.getGuitarBuyPrice());
        assertEquals(200, electricGuitar.getGuitarBuyPrice());
        assertEquals(250, bassGuitar.getGuitarBuyPrice());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(200, acousticGuitar.getGuitarSellPrice());
        assertEquals(400, electricGuitar.getGuitarSellPrice());
        assertEquals(450, bassGuitar.getGuitarSellPrice());
    }

    @Test
    public void canCheckIfGuitarHasPlugIn(){
        assertEquals(false, acousticGuitar.guitarIsPlugIn());
        assertEquals(true, electricGuitar.guitarIsPlugIn());
        assertEquals(true, bassGuitar.guitarIsPlugIn());
    }


}
