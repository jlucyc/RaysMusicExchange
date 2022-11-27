import Shop.GuitarItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarItemTest {

    GuitarItem guitarItem;
    GuitarItem guitarItem2;

    @Before
    public void before(){
        guitarItem = new GuitarItem("Guitar Strings", 20, 35);
        guitarItem2 = new GuitarItem("Capo", 25, 50);
    }

    @Test
    public void canGetGuitarItemDescription(){
        assertEquals("Guitar Strings", guitarItem.getDescription());
        assertEquals("Capo", guitarItem2.getDescription());
    }

    @Test
    public void canGetMarkUpOnGuitarItems(){
        assertEquals(15, guitarItem.calculateMarkup());
        assertEquals(25, guitarItem2.calculateMarkup());
    }

}
