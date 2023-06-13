package Main.Enums;

public enum Weapon {

    SWORD(10),
    CLUB(5),
    AXE(15),
    MACE(20);

    private final int value;

    Weapon(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
