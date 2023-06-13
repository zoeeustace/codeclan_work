package Main.Enums;

public enum Poison {
    HAMLET(15);

    private final int value;

    Poison(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
