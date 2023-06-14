public class DrumSticks extends Item{

    private String material;
    private String brand;

    public DrumSticks(double buyPrice, double sellPrice, String description, String material, String brand) {
        super(buyPrice, sellPrice, description);
        this.material = material;
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
