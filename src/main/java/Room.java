import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Room {

    private int capacity;
    private List<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        if (guests.size() < capacity) {
            guests.add(guest);
            System.out.println(guest.getName() + " has been checked into the room.");
        } else {
            System.out.println("The room is already at full capacity.");
        }
    }

    public void removeGuest(Guest guest) {
        if (guests.remove(guest)) {
            System.out.println(guest.getName() + " has been checked out of the room.");
        } else {
            System.out.println("The guest is not checked into this room.");
        }
    }

    public static double calculateSize(double length, double width) {
        return length * width;
    }
}
