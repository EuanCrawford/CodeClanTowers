import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(45, RoomType.DOUBLE, 69.69);
        bedroom2 = new Bedroom(54, RoomType.DOUBLE, 69.69);
        bedroom3 = new Bedroom(69, RoomType.DOUBLE, 69.69);
        conferenceRoom = new ConferenceRoom("Merryweather Gold Room", 25, "1950's Motel");
        guest = new Guest("Wilfred", "Bob", 14);
        diningRoom = new DiningRoom("Crusty Rusty", 10);
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void kickWilfredOut(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkOutGuestFromBedroom(guest, bedroom);
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canBookRoomForTwoNights() {
        hotel.bookRoom(bedroom, 2, guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getSizeOfDiningRoom());
    }

    @Test
    public void canReturnListOfEmptyRooms() {
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        bedroom.addGuest(guest);
        assertEquals(2, hotel.getVacantBedrooms().size());
    }
}
