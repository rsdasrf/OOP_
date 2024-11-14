import java.util.Random;
import java.util.Scanner;

public class SiCS extends Kingdom{
    
    public SiCS() {
        super("Si CS");
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
        public void startQuest(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StoryLine objStoryLine = new StoryLine();
        Altreia objAltreia = new Altreia();
        Kamadan objKamadan = new Kamadan();
        Khaiamanan objKhaiamanan = new Khaiamanan();
        Shang objShang = new Shang();
        
        int choiceCharacter = 0;

        
        while(objKhaiamanan.getHealth() > 0){
            int roundCounter = 1;

            boolean doneInput = false;

            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Kamadan's HP: " + objKamadan.getHealth() + " | Mana: " +  objKamadan.getMana() + "     | Syntax Sleuth | Logic Master | Loop Ninja    |");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana() + "     | Code Catalyst | Focus Shield | Syntax Strike |");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Shang's HP: " + objShang.getHealth() + "   | Mana: " + objShang.getMana() + "     | Barrier Boost | Skill Swap   | Pathfinder    |");
            System.out.println("\n-----------------------------------------------------------------------------------------");
           
            while (!doneInput) {
                System.out.println();
                System.out.println("Choose your character: ");
                System.out.println("1. Kamadan");
                System.out.println("2. Altreia");
                System.out.println("3. Shang");
                System.out.print("Enter choice: ");

                try {
                    choiceCharacter = scanner.nextInt();
                    if (choiceCharacter == 1 || choiceCharacter == 2 || choiceCharacter == 3) {
                        doneInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Try Again.");
                    scanner.next();
                }
            }

            while(objKhaiamanan.getHealth() > 0 && (choiceCharacter == 1 && objKamadan.getHealth() > 0 || choiceCharacter == 2 && objAltreia.getHealth() > 0 || choiceCharacter == 3 && objShang.getHealth() > 0)) {
                System.out.println("\n------------------------------------------");
                System.out.println("|              SICS KINGDOM              |");
                System.out.println("------------------------------------------");
                System.out.println("Round: " + roundCounter);
                
                // Display stats
                if (choiceCharacter == 1) {
                    System.out.println("You have entered as \'Kamadan\'");
                    System.out.println("Kamadan's HP: " + objKamadan.getHealth() + " | Mana: " + objKamadan.getMana());
                } else if(choiceCharacter == 2) {
                    System.out.println("You have entered as \'Altreia\'");
                    System.out.println("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana());
                }else{
                    System.out.println("You have entered as \'Shang\'");
                    System.out.println("Shang's HP: " + objShang.getHealth() + " | Mana: " + objShang.getMana());
                }
                System.out.println(objKhaiamanan.getName() + "'s HP: " + objKhaiamanan.getHealth());

                // Player chooses an attack
                System.out.println("\nChoose your attack:");
                if (choiceCharacter == 1) {
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                } else if (choiceCharacter == 2 ){
                    System.out.println("1. Code Catalyst (30 damage, 25 mana)");
                    System.out.println("2. Focus Shield (35 damage, 40 mana)");
                    System.out.println("3. Syntax Strike (45 damage, 55 mana)");
                }else{
                    System.out.println("1. Barrier Boost (25 damage, 40 mana)");
                    System.out.println("2. Skill Swap (40 damage,60 mana)");
                    System.out.println("3. Pathfinder (50 damage, 70 mana)");
                }
                
                int choiceAttack = 0;
                int attackDamage;

                while (choiceAttack < 1 || choiceAttack > 3) {
                System.out.print("\nEnter Attack: ");
                try {
                    choiceAttack = scanner.nextInt();
                    if (choiceAttack < 1 || choiceAttack > 3) {
                        System.out.println("Invalid choice! You lost your chance to attack!");
                        int enemyDamage = random.nextInt(3);
                        simulateTyping(objKhaiamanan.getName() + " uses " + objKhaiamanan.getSkill1() + "! It deals " + enemyDamage + " damage.");
                        objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                    int enemyDamage = random.nextInt(3);
                    simulateTyping(objKhaiamanan.getName() + " uses " + objKhaiamanan.getSkill1() + "! It deals " + enemyDamage + " damage.");
                    objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                }
            }

                if (choiceCharacter == 1) {
                    attackDamage = objKamadan.attack(choiceAttack);
                } else if(choiceCharacter == 2){
                    attackDamage = objAltreia.attack(choiceAttack);
                }else{
                    attackDamage = objShang.attack(choiceAttack);
                }

                if (attackDamage == -1) {
                    simulateTyping("Invalid choice! No damage dealt, and " + objKhaiamanan.getName() + " takes the chance to attack.");
                } else if (attackDamage == -2) {
                    System.out.println("Not enough mana! You cannot attack.");
                } else {
                    objKhaiamanan.setHealth(objKhaiamanan.getHealth() - attackDamage); 
                    System.out.println("You deal " + attackDamage + " damage to " + objKhaiamanan.getName() + "!");
                }

                if (objKhaiamanan.getHealth() > 0) {
                    int enemySkill = random.nextInt(3);
                    int enemyDamage;
                    String skillUsed;
                    
                    if(enemySkill == 0){
                        enemyDamage = 45;
                        skillUsed = objKhaiamanan.getSkill1();
                    }else if (enemySkill == 1){
                        enemyDamage = 55;
                        skillUsed = objKhaiamanan.getSkill2();
                    }else{
                        enemyDamage = 70;
                        skillUsed = objKhaiamanan.getSkill3();
                    }

                    simulateTyping(objKhaiamanan.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");

                    if (choiceCharacter == 1) {
                        objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                    } else if(choiceCharacter == 2){
                        objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                    } else{
                        objShang.setHealth(objShang.getHealth() - enemyDamage);
                    }

                    roundCounter++;
                    
                    if (choiceCharacter == 1 && objKamadan.getHealth() <= 0){
                        simulateTyping("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");

                            System.out.println();
                            objStoryLine.gameover();
                            System.exit(0);
                    } else if (choiceCharacter == 2 && objAltreia.getHealth() <= 0){
                        simulateTyping("Altreia collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");

                            System.out.println();
                            objStoryLine.gameover();
                            System.exit(0);

                    } else if (choiceCharacter == 3 && objShang.getHealth() <= 0){
                        simulateTyping("Altreia collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");

                            System.out.println();
                            objStoryLine.gameover();
                            System.exit(0);
                    } else{
                        doneInput = false;
                        while (!doneInput) {
                            System.out.println();
                            System.out.println("Choose your character: ");
                            System.out.println("1. Kamadan");
                            System.out.println("2. Altreia");
                            System.out.println("3. Shang");
                            System.out.print("Enter choice: ");
        
                            try {
                                choiceCharacter = scanner.nextInt();
                                if (choiceCharacter == 1 || choiceCharacter == 2 || choiceCharacter == 3) {
                                    doneInput = true;
                                } else {
                                    System.out.println("Invalid input. Please enter either 1, 2, or, 3.");
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input. Try Again.");
                                scanner.next();
                            }
                        }
                    }                   
                }
            }

            simulateTyping("With one final strike, Kamadan, Altreia, and Shang defeat " + objKhaiamanan.getName() + "." + objKhaiamanan.getName() + " stagger back, muttering in defeat...");
            upgrade();
            int upgradeChoice = scanner.nextInt();
            switch (upgradeChoice) {
                case 1:
                    if (choiceCharacter == 1) {
                        objKamadan.setHealth(Math.min(objKamadan.getHealth() + 50, 250));
                        simulateTyping("Kamadan increases her HEALTH    ! UPDATED HEALTH: " + objKamadan.getHealth());
                    } else if(choiceCharacter == 2){
                        objAltreia.setHealth(Math.min(objAltreia.getHealth() + 50, 250));
                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objAltreia.getHealth());
                    } else{
                        objShang.setHealth(Math.min(objShang.getHealth() + 50, 250));
                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objShang.getHealth());
                    }
                    break;
                case 2:
                    if (choiceCharacter == 1) {
                        objKamadan.setMana(Math.min(objKamadan.getMana() + 50, 200));
                        simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + objKamadan.getMana());
                    } else if(choiceCharacter == 2){
                        objAltreia.setMana(Math.min(objAltreia.getMana() + 50, 200));
                        simulateTyping("Altreia increases her MANA! UPDATED MANA: " + objAltreia.getMana());
                    } else{
                        objShang.setHealth(Math.min(objShang.getHealth() + 50, 250));
                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objShang.getHealth());
                    }
                    break;
                default:
                    simulateTyping("Invalid choice! No upgrades applied.");
            }
        }

    }
}