import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StoryLine objStoryLine = new StoryLine();
        ThirdStreet objThirdStreet = new ThirdStreet();
        SiITYou objSiITYou = new SiITYou();
        SiCS objSiCS = new SiCS();
        
        final String RED = "\u001B[31m"; 
        final String RESET = "\u001B[0m";

        boolean enterGame = true;

        final int consoleWidth = 80;
        System.out.println( "============================================================================================================================");
        System.out.println( "||"+RED+"                                            Welcome To No Way Out: The Final Test                                      "+RESET+"||"+RESET);
        System.out.println( "============================================================================================================================"+RESET);

        String asciiArt = """
                ███▄    █  ▒█████      █     █░ ▄▄▄     ▓██   ██▓    ▒█████   █    ██ ▄▄▄█████▓
                ██ ▀█   █ ▒██▒  ██▒   ▓█░ █ ░█░▒████▄    ▒██  ██▒   ▒██▒  ██▒ ██  ▓██▒▓  ██▒ ▓▒
                ▓██  ▀█ ██▒▒██░  ██▒   ▒█░ █ ░█ ▒██  ▀█▄   ▒██ ██░   ▒██░  ██▒▓██  ▒██░▒ ▓██░ ▒░
                ▓██▒  ▐▌██▒▒██   ██░   ░█░ █ ░█ ░██▄▄▄▄██  ░ ▐██▓░   ▒██   ██░▓▓█  ░██░░ ▓██▓ ░ 
                ▒██░   ▓██░░ ████▓▒░   ░░██▒██▓  ▓█   ▓██▒ ░ ██▒▓░   ░ ████▓▒░▒▒█████▓   ▒██▒ ░ 
                ░ ▒░   ▒ ▒ ░ ▒░▒░▒░    ░ ▓░▒ ▒   ▒▒   ▓▒█░  ██▒▒▒    ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒   ▒ ░░   
                ░ ░░   ░ ▒░  ░ ▒ ▒░      ▒ ░ ░    ▒   ▒▒ ░▓██ ░▒░      ░ ▒ ▒░ ░░▒░ ░ ░     ░    
                ░   ░   ░ ░ ░ ░ ▒       ░   ░    ░   ▒   ▒ ▒ ░░     ░ ░ ░ ▒   ░░░ ░ ░   ░      
                ░          ░ ░         ░          ░  ░░ ░            ░ ░     ░              
                ░                                   ░ ░                                 
                """;

                String[] lines = asciiArt.split("\n");
                for (int i = 0; i < lines.length; i++) {
                    String line = lines[i]; 
                    System.out.println(RED + "\t\t\t" + centerText(line, consoleWidth));
                }
                System.out.println(RESET);

        while (enterGame) {
            System.out.print("\t\t\t\t\tDo you want to enter the game? (Yes/No): ");
            String option = scan.nextLine();

            if (option.equalsIgnoreCase("Yes")) {
                while (enterGame) {
                System.out.print("\t\t\t\t\tDo you want to skip the storyline? (Yes/No): ");
                String optionStoryLine = scan.nextLine();
                    try {
                        if (optionStoryLine.equalsIgnoreCase("Yes")) {
                            objStoryLine.questOne();
                            objThirdStreet.enter(); 
                            objThirdStreet.startQuest();
                            objSiITYou.enter();
                            objSiITYou.startQuest();
                            objSiCS.enter();
                            objSiCS.startQuest();
                            enterGame = false;
                        }else if (optionStoryLine.equalsIgnoreCase("No")) {
                            objStoryLine.prologue();
                            objStoryLine.questOne();
                            objThirdStreet.enter();
                            objThirdStreet.startQuest();
                            objSiITYou.enter();
                            objSiITYou.startQuest();
                            objSiCS.enter();
                            objSiCS.startQuest();
                            enterGame = false;
                        }else {
                            System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                        }
                    } catch (Exception e) {
                        scan.nextLine();
                    }
                }
            } else if (option.equalsIgnoreCase("No")) {
                System.out.print("\t\t\t\t\tI WILL ALWAYS FIND MY WAY BACK TO YOU");
                break;
            } else {
                System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
            }
        }
  
    }

    private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
}