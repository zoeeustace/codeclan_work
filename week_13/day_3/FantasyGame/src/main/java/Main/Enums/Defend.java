package Main.Enums;

public enum Defend {

    DEFEND(10);

    private final int value;

    Defend(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
