package main;

public abstract class Product {

    private double buyPrice;
    private double sellPrice;
    private String manufacturer;
    private String productName;
    private long id;

    public Product(double buyPrice, double sellPrice, String manufacturer, long id, String productName) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.id = id;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double calculateMarkUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }
}
