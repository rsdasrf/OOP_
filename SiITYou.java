import java.util.Random;
import java.util.Scanner;

public class SiITYou extends Kingdom {
    public SiITYou() {
        super("Si IT You");
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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Kamadan kamadan = new Kamadan();
        Altreia objAltreia = new Altreia();
        StoryLine objStoryLine = new StoryLine();
        int choiceCharacter = 0;

        Enemy[] enemies = {
            new Ada(),
            new Turing(),
        };

        for (int i = 0; i < enemies.length; i++) {
            Enemy enemy = enemies[i];

            boolean doneInput = false;
            int roundCounter = 1;
            
            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana() + "     | Syntax Sleuth | Logic Master | Loop Ninja    |");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana() + "     | Code Catalyst | Focus Shield | Syntax Strike |");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            
           if(kamadan.getHealth() > 0 && objAltreia.getHealth() > 0){
            while (!doneInput) {
              
                System.out.println("\nChoose your character: ");
                System.out.println("1. Kamadan");
                System.out.println("2. Altreia");
                System.out.print("Enter choice: ");

                try {
                    choiceCharacter = scanner.nextInt();
                    if (choiceCharacter == 1 || choiceCharacter == 2) {
                        doneInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter 1 or 2.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Try again.");
                    scanner.next();
                }
            }
        }


            while (enemy.getHealth() > 0 && (choiceCharacter == 1 && kamadan.getHealth() > 0 || choiceCharacter == 2 && objAltreia.getHealth() > 0)) {
                System.out.println("\n------------------------------------------");
                System.out.println("|             SIITYOU KINGDOM            |");
                System.out.println("------------------------------------------");
                System.out.println("Round: " + roundCounter);

                // Display stats
                if (choiceCharacter == 1) {
                    System.out.println("You have entered as \'Kamadan\'");
                    System.out.print("Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                } else {
                    System.out.println("You have entered as \'Altreia\'");
                    System.out.println("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana());
                }
                System.out.println("\n" + enemy.getName() + "'s HP: " + enemy.getHealth());

                // Player chooses an attack
                System.out.println("\nChoose your attack:");
                if (choiceCharacter == 1) {
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                } else {
                    System.out.println("1. Code Catalyst (30 damage, 25 mana)");
                    System.out.println("2. Focus Shield (35 damage, 40 mana)");
                    System.out.println("3. Syntax Strike (45 damage, 55 mana)");
                }
                
                System.out.print("\nEnter Attack: ");
                int choiceAttack = 0;  // Default value in case of invalid input
                int attackDamage;

                try {
                    choiceAttack = scanner.nextInt();  
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid integer for the attack.");
                    scanner.next();  
                    return; 
                }

          
                if (choiceCharacter == 1) {
                    attackDamage = kamadan.attack(choiceAttack);
                } else {
                    attackDamage = objAltreia.attack(choiceAttack);
                }

                if (attackDamage == -1) {
                    simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                } else if (attackDamage == -2) {
                    System.out.println("Not enough mana! You cannot attack.");
                } else {
                    enemy.setHealth(enemy.getHealth() - attackDamage); 
                    System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                }


                if (enemy.getHealth() > 0) {
                    int adaSkill = random.nextInt(2);//Either ang first skill or ang second
                    int enemyDamage;//first skill damage(20) second skill damage (40)
                    String skillUsed;//ngalan sa skill after mapili sa randomizer either ang 1 or 2
                    
                    if(adaSkill == 0){
                        enemyDamage = 20;
                        skillUsed = enemy.getSkill1();
                    }else{
                        enemyDamage = 40;
                        skillUsed = enemy.getSkill2();
                    }

                    simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.\n");

                    if (choiceCharacter == 1) {
                        kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                    } else {
                        objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                    }

                    roundCounter++;
                    if (choiceCharacter == 1 && kamadan.getHealth() <= 0 && objAltreia.getHealth() > 0){
                        simulateTyping("Kamadan collapses to the ground, her vision fading. But it is not too late.");
                        simulateTyping("Altreia has took over the battle!");
                        
                        while(objAltreia.getHealth() > 0 && enemy.getHealth() > 0){
                            System.out.println("\n------------------------------------------");
                            System.out.println("|             SIITYOU KINGDOM            |");
                            System.out.println("------------------------------------------");
                            System.out.println("Round: " + roundCounter);
            
                                System.out.println("You have entered as \'Altreia\'");
                                System.out.println("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana());
                            
                            System.out.println("\n" + enemy.getName() + "'s HP: " + enemy.getHealth());
            
                            // Player chooses an attack
                            System.out.println("\nChoose your attack:");
                                System.out.println("1. Code Catalyst (30 damage, 25 mana)");
                                System.out.println("2. Focus Shield (35 damage, 40 mana)");
                                System.out.println("3. Syntax Strike (45 damage, 55 mana)");
                            
                            
                            System.out.print("\nEnter Attack: ");
                            choiceAttack = scanner.nextInt();
            
                            // Handle attack for chosen character
                                attackDamage = objAltreia.attack(choiceAttack);
                            
                            if (attackDamage == -1) {
                                simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                            } else if (attackDamage == -2) {
                                System.out.println("Not enough mana! You cannot attack.");
                            } else {
                                enemy.setHealth(enemy.getHealth() - attackDamage); 
                                System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                            }
            
                            if (enemy.getHealth() > 0) {
                                adaSkill = random.nextInt(2);//Either ang first skill or ang second
                                
                                if(adaSkill == 0){
                                    enemyDamage = 70;
                                    skillUsed = enemy.getSkill1();
                                }else{
                                    enemyDamage = 80;
                                    skillUsed = enemy.getSkill2();
                                }
                                roundCounter++;
            
                                simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.\n");
            
                                objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                                
                        }

                        
                    }
                    if(objAltreia.getHealth() <= 0 && enemy.getHealth() > 0){
                            simulateTyping("Altreia collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");

                            System.out.println();

                            System.out.println(" ░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓██████████████▓▒░░▒▓████████▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░  ");
                            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓█▓▒▒▓███▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░  ");
                            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓██████▓▒░░ ▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓██████▓▒░   ░▒▓██▓▒░  ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░ ");
                            
                            System.exit(0);
                        }
                    } else if (choiceCharacter == 2 && objAltreia.getHealth() <= 0 && kamadan.getHealth() > 0){
                        simulateTyping("Altreia collapses to the ground, her vision fading. But it is not too late.");
                        simulateTyping("Kamadan has took over the battle!");

                        while(enemy.getHealth() > 0 && kamadan.getHealth() > 0){
                            System.out.println("\n------------------------------------------");
                            System.out.println("|             SIITYOU KINGDOM            |");
                            System.out.println("------------------------------------------");
                            System.out.println("Round: " + roundCounter);
            
                            // Display stats
                            
                                System.out.println("You have entered as \'Kamadan\'");
                                System.out.print("Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                            
                            System.out.println("\n" + enemy.getName() + "'s HP: " + enemy.getHealth());
            
                            // Player chooses an attack
                            System.out.println("\nChoose your attack:");
                            
                                System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                                System.out.println("2. Logic Master (40 damage, 60 mana)");
                                System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                            
                            
                            System.out.print("\nEnter Attack: ");
                            choiceAttack = scanner.nextInt();
            
                            // Handle attack for chosen character
                                attackDamage = kamadan.attack(choiceAttack);
                            
            
                            if (attackDamage == -1) {
                                simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                            } else if (attackDamage == -2) {
                                System.out.println("Not enough mana! You cannot attack.");
                            } else {
                                enemy.setHealth(enemy.getHealth() - attackDamage); 
                                System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                            }
            
                            if (enemy.getHealth() > 0) {
                                adaSkill = random.nextInt(2);//Either ang first skill or ang second
                                
                                if(adaSkill == 0){
                                    enemyDamage = 20;
                                    skillUsed = enemy.getSkill1();
                                }else{
                                    enemyDamage = 40;
                                    skillUsed = enemy.getSkill2();
                                }
            
                                simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.\n");
            
                                    kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                       
                                roundCounter++;
                        }
                    } if(kamadan.getHealth() <= 0 && enemy.getHealth() > 0){

                            simulateTyping("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");

                            System.out.println();
                            objStoryLine.gameover();
                            System.exit(0);
                        }
                    } else{
                        doneInput = false;
                        while (!doneInput) {
                            System.out.println("Choose your character for the next round:");
                            System.out.println("1. Kamadan");
                            System.out.println("2. Altreia");
                            System.out.print("Enter choice: ");
        
                            try {
                                choiceCharacter = scanner.nextInt();
                                if (choiceCharacter == 1 || choiceCharacter == 2) {
                                    doneInput = true;
                                } else {
                                    System.out.println("Invalid input. Please enter 1 or 2.\n");
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                scanner.next();
                            }
                        }
                    }                   
                }
            }
            
            if(kamadan.getHealth() > 0 && objAltreia.getHealth() > 0){
                simulateTyping("With one final strike, Kamadan and Altreia both defeat " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                
                upgrade();
                int upgradeChoice = scanner.nextInt();

                simulateTyping("Who do you want to upgrade?\n");
                System.out.println("1. Kamadan");
                System.out.println("2. Altreia");
                System.out.print("Enter choice: ");
                int chooseCharacter = scanner.nextInt();

                if(chooseCharacter == 1){
                    
                switch (upgradeChoice) {
                case 1:
                        kamadan.setHealth(Math.min(kamadan.getHealth() + 50, 250));
                        simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + kamadan.getHealth());
                    
                    break;
                case 2:
                        kamadan.setMana(Math.min(kamadan.getMana() + 50, 200));
                        simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + kamadan.getMana());
                   
                    break;
                default:
            }
        } else{
                    upgrade();
                    upgradeChoice = scanner.nextInt();
                switch (upgradeChoice) {
                case 1:
                        objAltreia.setHealth(Math.min(objAltreia.getHealth() + 50, 250));
                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objAltreia.getHealth());
                    
                    break;
                case 2:
                        objAltreia.setMana(Math.min(objAltreia.getMana() + 50, 200));
                        simulateTyping("Altreia increases her MANA! UPDATED MANA: " + objAltreia.getMana());
                    
                    break;
                default:
            }
        }
                
        }else if(kamadan.getHealth() < 0 && objAltreia.getHealth() > 0){
                simulateTyping("With one final strike, Altreia has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");

                    upgrade();
                    int upgradeChoice = scanner.nextInt();
                switch (upgradeChoice) {
                case 1:
                        objAltreia.setHealth(Math.min(objAltreia.getHealth() + 50, 250));
                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objAltreia.getHealth());
                    
                    break;
                case 2:
                        objAltreia.setMana(Math.min(objAltreia.getMana() + 50, 200));
                        simulateTyping("Altreia increases her MANA! UPDATED MANA: " + objAltreia.getMana());
                    
                    break;
                default:
            }
        }else {
                simulateTyping("With one final strike, Kamadan has defeated" + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
            upgrade();
            int upgradeChoice = scanner.nextInt();
            switch (upgradeChoice) {
                case 1:
                        kamadan.setHealth(Math.min(kamadan.getHealth() + 50, 250));
                        simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + kamadan.getHealth());
                    
                    break;
                case 2:
                        kamadan.setMana(Math.min(kamadan.getMana() + 50, 200));
                        simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + kamadan.getMana());
                 
                    break;
                default:
                  
                }
            }
        }
        objStoryLine.thirdNarration();
        objStoryLine.questThree();
    }
}