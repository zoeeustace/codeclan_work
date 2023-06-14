import Behaviours.ISell;

public abstract class Item implements ISell {

    private double buyPrice;
    private double sellPrice;
    private String description;

    public Item(double buyPrice, double sellPrice, String description) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
