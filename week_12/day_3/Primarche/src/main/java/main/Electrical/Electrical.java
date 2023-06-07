package main.Electrical;

import main.Product;

public abstract class Electrical extends Product {

    private int powerConsumption;
    private int warranty;

    public Electrical(double buyPrice, double sellPrice, String manufacturer, String productName, long id, int powerConsumption, int warranty) {
        super(buyPrice, sellPrice, manufacturer, id, productName);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String turnOn(){
        return "Turning On";
    }

//    public abstract String turnOn(); abstract method - would mean that all child classes from this have the method turnOn, but they need to be specified in each child class
}
