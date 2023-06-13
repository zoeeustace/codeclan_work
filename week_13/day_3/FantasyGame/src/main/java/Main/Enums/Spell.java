package Main.Enums;

public enum Spell {

    FIREBALL(35),
    LIGHTNING(25);

    private final int value;


    Spell(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
