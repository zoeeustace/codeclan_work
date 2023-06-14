public abstract class Instrument extends Item {

    private String material;
    private String type;
    private String colour;


    public Instrument(double buyPrice, double sellPrice, String description, String material, String type, String colour) {
        super(buyPrice, sellPrice, description);
        this.material = material;
        this.type = type;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
