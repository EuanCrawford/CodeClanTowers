import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void before() {
        bedroom = new Bedroom(45, RoomType.DOUBLE, 69.69);
        conferenceRoom = new ConferenceRoom("Merryweather Gold Room", 25, "1950's Motel");
        guest = new Guest("Wilfred", "Bob", 14);
        diningRoom = new DiningRoom("The Salty Spitoon", 50);
    }

    @Test
    public void bedroomHasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Merryweather Gold Room", conferenceRoom.getName());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canCalculateSizeOfBedroom() {
        assertEquals(100.00, Room.calculateSize(10.00, 10.00), 0.0);
    }

//    @Test
//    public void hasCollectionOfGuests() {
//        assertEquals();
//    }
}
