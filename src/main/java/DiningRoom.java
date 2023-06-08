import java.util.ArrayList;
import java.util.List;

class DiningRoom extends Room{
    private String name;
    private int capacity;
    private List<Guest> guests;

    public DiningRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        if (guests.size() < capacity) {
            guests.add(guest);
            System.out.println(guest.getName() + " has been added to the dining room.");
        } else {
            System.out.println("The dining room is already at full capacity.");
        }
    }

    public void removeGuest(Guest guest) {
        if (guests.remove(guest)) {
            System.out.println(guest.getName() + " has been removed from the dining room.");
        } else {
            System.out.println("The guest is not in the dining room.");
        }
    }
}