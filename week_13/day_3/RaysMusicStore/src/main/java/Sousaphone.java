import Behaviours.IPlay;

public class Sousaphone extends Instrument implements IPlay {

    private int valves;
    private String classificationNumber;


    public Sousaphone(double buyPrice, double sellPrice, String description, String material, String type, String colour, int valves, String classificationNumber) {
        super(buyPrice, sellPrice, description, material, type, colour);
        this.valves = valves;
        this.classificationNumber = classificationNumber;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String getClassificationNumber() {
        return classificationNumber;
    }

    public void setClassificationNumber(String classificationNumber) {
        this.classificationNumber = classificationNumber;
    }

    @Override
    public String play(){
        return "Toot toot";
    }
}
