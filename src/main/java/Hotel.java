import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hotel {
    private List<Bedroom> bedrooms;
    private List<ConferenceRoom> conferenceRooms;
    private Map<String, DiningRoom> diningRooms;

    public Hotel() {
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new HashMap<>();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int getSizeOfDiningRoom() {
        return diningRooms.size();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuestFromBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }

//    public Booking bookRoom(int nightsBooked, Bedroom bedroom, Guest guest) {
//        bedroom.addGuest(guest);
//    }

    public Booking bookRoom(Bedroom bedroom, int nights, Guest guest) {
        if (bedroom.getGuests().isEmpty()) {
            Booking booking = new Booking(bedroom, nights);
            bedroom.addGuest(guest);
            System.out.println("Room " + bedroom.getRoomNumber() + " has been booked for " + nights + " nights by " + guest.getName() + ".");
            return booking;
        } else {
            System.out.println("Room occupado");
            return null;
        }
    }

    public List<Bedroom> getVacantBedrooms() {
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<>();
        for (Bedroom bedroom: this.bedrooms) {
            if (bedroom.getGuests().isEmpty()) {
                emptyBedrooms.add(0, bedroom);
            }
        }
        return emptyBedrooms;
    }


}
