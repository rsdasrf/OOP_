import java.util.Random;
import java.util.Scanner;

public class ThirdStreet extends Kingdom {
    Scanner scanner = new Scanner(System.in);

    public ThirdStreet() {
        super("Third Street");
    }

    private void simulateTyping(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.err.println("An error occurred during the delay.");
            }
        }
        System.out.println();
    }

    private static void upgrade() {
        System.out.println("You have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
    }

    @Override
    public void enter() {
        System.out.println("\t\t\t\tWelcome to " + name + ", the land of coding challenges!");
    }

    @Override
    public void startQuest() {
    Random random = new Random();
    Kamadan kamadan = new Kamadan();
    StoryLine objStoryLine = new StoryLine();
    Enemy[] enemies = {
            new Boozy(),
            new Sloshed(),
            new Jager()
    };

    for (int i = 0; i < enemies.length; i++) {
        Enemy enemy = enemies[i];
        int roundCounter = 1;
        while (enemy.getHealth() > 0 && kamadan.getHealth() > 0) {
            System.out.println("\n------------------------------------------");
            System.out.println("|           THIRDSTREET KINGDOM          |");
            System.out.println("------------------------------------------");
            System.out.println("Round: " + roundCounter);
            System.out.println("Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
            System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());

            System.out.println("\nChoose your attack:");
            System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
            System.out.println("2. Logic Master (40 damage, 60 mana)");
            System.out.println("3. Loop Ninja (30 damage, 20 mana)");

            int choice = -1;
            while (choice < 1 || choice > 3) {
                System.out.print("\nEnter Attack: ");
                try {
                    choice = scanner.nextInt();
                    if (choice < 1 || choice > 3) {
                        System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                        int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36)));
                        simulateTyping(enemy.getName() + " uses " + enemy.getSkill1() + "! It deals " + enemyDamage + " damage.");
                        kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                    int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36)));
                    simulateTyping(enemy.getName() + " uses " + enemy.getSkill1() + "! It deals " + enemyDamage + " damage.");
                    kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                }
            }

            // Only apply attack damage if valid choice is made
            int attackDamage = kamadan.attack(choice);
            if (attackDamage == -1) {
                simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
            } else if (attackDamage == -2) {
                System.out.println("Not enough mana! You cannot attack.");
            } else {
                enemy.setHealth(enemy.getHealth() - attackDamage);
                System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
            }

            // Enemy's turn to attack after the player's turn
            if (enemy.getHealth() > 0) {
                int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36)));
                simulateTyping(enemy.getName() + " uses " + enemy.getSkill1() + "! It deals " + enemyDamage + " damage.");
                kamadan.setHealth(kamadan.getHealth() - enemyDamage);

                if (kamadan.getHealth() <= 0) {
                    simulateTyping("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                    System.out.println();
                    objStoryLine.gameover();
                    System.exit(0);
                }
            }
            roundCounter++;
        }

        simulateTyping("\nKamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
        simulateTyping("\nWith one final strike, Kamadan defeats " + enemy.getName() + ". They stagger back, muttering in defeat...");
        upgrade();

        // Wrap upgrade input in try-catch block to handle invalid input
        int upgradeChoice = -1;
        while (upgradeChoice < 1 || upgradeChoice > 2) {
            try {
                System.out.print("\nEnter your upgrade choice: ");
                upgradeChoice = scanner.nextInt();
                if (upgradeChoice < 1 || upgradeChoice > 2) {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        }

        switch (upgradeChoice) {
            case 1:
                kamadan.setHealth(Math.min(kamadan.getHealth() + 50, 250));
                simulateTyping("\nKamadan increases her HEALTH! UPDATED HEALTH: " + kamadan.getHealth());
                break;
            case 2:
                kamadan.setMana(Math.min(kamadan.getMana() + 50, 200));
                simulateTyping("\nKamadan increases her MANA! UPDATED MANA: " + kamadan.getMana());
                break;
        }

        if (i < enemies.length - 1) {
            simulateTyping("'You have defeated " + enemy.getName() + ",' a voice announces. 'Prepare for your next challenge: " + enemies[i + 1].getName() + ".'");
        }
    }

    simulateTyping("\nKamadan stands victorious. The streets are quiet now.");
    simulateTyping("She takes a deep breath and prepares for the next trial.");
    System.out.println();
    System.out.println("============================================================================================================================");

    objStoryLine.unlockKey();
    boolean isTrue = false;

    while (!isTrue) {
        try {
            int enteredGate = objStoryLine.enterGate();
            if (enteredGate == 143) {
                isTrue = true;
                System.out.println("||                                                 Access granted. Welcome!                                               ||");
                System.out.println("============================================================================================================================");
            } else {
                System.out.println("||                                                  Incorrect ID! Try again.                                              ||");
                System.out.println("============================================================================================================================");
            }
        } catch (Exception e) {
            System.out.println("||                                             Invalid input! Please enter a valid number.                                 ||");
            System.out.println("============================================================================================================================");
            scanner.next();
        }
    }
    objStoryLine.secondNarration();
    objStoryLine.questTwo();
    }
}