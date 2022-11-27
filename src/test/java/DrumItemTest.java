import Shop.DrumItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumItemTest {

    DrumItem drumItem;
    DrumItem drumItem2;

    @Before
    public void before(){
        drumItem = new DrumItem("Drum Sticks", 10, 20);
        drumItem2 = new DrumItem("Drum Skins", 20, 40);

        }

    @Test
    public void canGetDrumItemsDescription(){
        assertEquals("Drum Sticks", drumItem.getDescription());
        assertEquals("Drum Skins", drumItem2.getDescription());
    }

    @Test
    public void canGetMarkupOnDrumItems(){
        assertEquals(10, drumItem.calculateMarkup());
        assertEquals(20, drumItem2.calculateMarkup());
    }


}

