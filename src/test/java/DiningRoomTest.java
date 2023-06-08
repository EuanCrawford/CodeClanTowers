import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom("The Salty Spitoon", 50);
        guest = new Guest("Wilfred", "Bob", 14);
    }

    @Test
    public void canAddGuests() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuests().size());
    }

//    @Test
//    public void canGetListOfGuests() {
//        diningRoom.addGuest(guest);
//        assertEquals(1 , diningRoom.getGuests());
//    }
}
