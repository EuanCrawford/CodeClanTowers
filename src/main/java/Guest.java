public class Guest {
    private String name;
    private String hairStyle;
    private int shoeSize;

    public Guest(String name, String hairStyle, int shoeSize) {
        this.name = name;
        this.hairStyle = hairStyle;
        this.shoeSize = shoeSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
}
