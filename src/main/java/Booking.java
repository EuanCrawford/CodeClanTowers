public class Booking {

    private int nightsBooked;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public double getBill(int nightsBooked) {
        return bedroom.getNightlyRate() * nightsBooked;
    }
}
