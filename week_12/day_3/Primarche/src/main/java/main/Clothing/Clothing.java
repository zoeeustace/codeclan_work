package main.Clothing;

import main.Product;

public abstract class Clothing extends Product {

    private int size;
    private String material;

    private boolean triable;
    public Clothing(double buyPrice, double sellPrice, String manufacturer, long id, String productName, int size, String material, boolean triable) {
        super(buyPrice, sellPrice, manufacturer, id, productName);
        this.size = size;
        this.material = material;
        this.triable = triable;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isTriable() {
        return triable;
    }

    public void setTriable(boolean triable) {
        this.triable = triable;
    }
}
