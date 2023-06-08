class ConferenceRoom extends Room {
    private String name;
    private String decor;

    public ConferenceRoom(String name, int capacity, String decor) {
        super(capacity);
        this.name = name;
        this.decor = decor;
    }

    public String getName() {
        return name;
    }
}
