import Behaviours.IPlay;
import Behaviours.ISell;

public class Theremin extends Instrument implements IPlay {


    public Theremin(double buyPrice, double sellPrice, String description, String material, String type, String colour) {
        super(buyPrice, sellPrice, description, material, type, colour);
    }


    @Override
    public String play() {
        return "Wooooooooeeooo";
    }
}
