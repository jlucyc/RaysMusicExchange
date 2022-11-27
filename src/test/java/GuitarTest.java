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
        acousticGuitar = new Guitar(GuitarType.ACOUSTIC, "Guitars", 200, 400);
        electricGuitar = new Guitar(GuitarType.ELECTRIC, "Guitars", 300, 600);
        bassGuitar = new Guitar(GuitarType.BASS,"Guitars", 350, 650);
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(GuitarType.ACOUSTIC, acousticGuitar.getGuitarType());
        assertEquals(GuitarType.ELECTRIC, electricGuitar.getGuitarType());
        assertEquals(GuitarType.BASS, bassGuitar.getGuitarType());
    }


    @Test
    public void canCheckIfGuitarHasPlugIn(){
        assertEquals(false, acousticGuitar.guitarIsPlugIn());
        assertEquals(true, electricGuitar.guitarIsPlugIn());
        assertEquals(true, bassGuitar.guitarIsPlugIn());
    }

    @Test
    public void canGetMarkUpOnGuitars(){
        assertEquals(200, acousticGuitar.calculateMarkup());
        assertEquals(300, electricGuitar.calculateMarkup());
        assertEquals(300, bassGuitar.calculateMarkup());
    }


}
