public class Altreia extends Hero {
    public Altreia() {
        super("Altreia", 230, 250); // Adjust health and mana as needed
    }
    
    
    @Override
    public int attack(int choice) {
        int damage;
        int manaCost;

        switch (choice) {
            case 1:
                damage = 20;
                manaCost = 15;
                break;
            case 2:
                damage = 35;
                manaCost = 50;
                break;
            case 3:
                damage = 45;
                manaCost = 70;
                break;
            default:
                return -1; // Invalid choice
        }

        if (getMana() >= manaCost) {
            setMana(getMana() - manaCost); // Deduct mana
            return damage; // Return the damage dealt
        } else {
            return -2; // Not enough mana
        }
    }
}