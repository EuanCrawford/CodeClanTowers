public enum RoomType {

        SINGLE(1, "Wee room"),
        DOUBLE(2, "Two's company"),
        TRIPLE(3, "Three's a crowd"),
        FAMILY(4, "Keep it in the family");

        private int capacity;
        private String name;

        RoomType(int capacity, String name) {
            this.capacity = capacity;
            this.name = name;
        }

        public int getCapacity() {
            return capacity;
        }

}
