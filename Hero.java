public abstract class Hero {
    private final String name;
    private int health;
    private int mana;

    public abstract int attack(int choice);

    public Hero(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}