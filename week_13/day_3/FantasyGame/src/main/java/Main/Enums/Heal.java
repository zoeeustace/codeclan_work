package Main.Enums;

public enum Heal {

    POTION(20),
    HERB(10);

    private final int value;

    Heal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
