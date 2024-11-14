import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class StoryLine {
    public void simulateTyping(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(0); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void kamadanPrologue(){
        System.out.println("\t\t\t\t============================================================================");
        System.out.println("\t\t\t\t||               You have successfully entered the game as:                ||");
        System.out.println("\t\t\t\t||      ██╗  ██╗ █████╗ ███╗   ███╗ █████╗ ██████╗  █████╗ ███╗   ██╗      ||");
        System.out.println("\t\t\t\t||      ██║ ██╔╝██╔══██╗████╗ ████║██╔══██╗██╔══██╗██╔══██╗████╗  ██║      ||");
        System.out.println("\t\t\t\t||      █████╔╝ ███████║██╔████╔██║███████║██║  ██║███████║██╔██╗ ██║      ||");
        System.out.println("\t\t\t\t||      ██╔═██╗ ██╔══██║██║╚██╔╝██║██╔══██║██║  ██║██╔══██║██║╚██╗██║      ||");
        System.out.println("\t\t\t\t||      ██║  ██╗██║  ██║██║ ╚═╝ ██║██║  ██║██████╔╝██║  ██║██║ ╚████║      ||");
        System.out.println("\t\t\t\t||      ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝      ||");
        System.out.println("\t\t\t\t============================================================================");
    }
    public void prologue() {
        System.out.println("\t\t\t\t============================================================================");
        System.out.print("\t\t\t\t||               You have successfully entered the game as:                ||\n");
        System.out.println("\t\t\t\t||      ██╗  ██╗ █████╗ ███╗   ███╗ █████╗ ██████╗  █████╗ ███╗   ██╗      ||");
        System.out.println("\t\t\t\t||      ██║ ██╔╝██╔══██╗████╗ ████║██╔══██╗██╔══██╗██╔══██╗████╗  ██║      ||");
        System.out.println("\t\t\t\t||      █████╔╝ ███████║██╔████╔██║███████║██║  ██║███████║██╔██╗ ██║      ||");
        System.out.println("\t\t\t\t||      ██╔═██╗ ██╔══██║██║╚██╔╝██║██╔══██║██║  ██║██╔══██║██║╚██╗██║      ||");
        System.out.println("\t\t\t\t||      ██║  ██╗██║  ██║██║ ╚═╝ ██║██║  ██║██████╔╝██║  ██║██║ ╚████║      ||");
        System.out.println("\t\t\t\t||      ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝      ||");
        System.out.println("\t\t\t\t============================================================================\n\n");

        simulateTyping("""
            \t\t\tIn the stillness of the night, Kamadan, a diligent student struggling with her OOP
            \t\tstudies, sat in a cluttered room, illuminated only by the soft glow of her computer screen
            \t\tas fatigue weighed heavily on her eyelids at midnight. Desperate for a brief distraction,
            \t\tshe searched for online games and found one titled 'No Way Out: The Final Test,' which promised
            \t\tadventure and escape. Intrigued, she clicked the link, and suddenly, her screen burst into
            \t\tblinding white light, causing her heart to race with confusion and fear.\n
        """);
        

        simulateTyping("""
            \t\tMinutes passed in eerie silence, and when her screen showed no signs of life, she
            \t\tinstinctively pressed the \"Esc\" key, only to see a chilling message flicker: "There is no
            \t\tescaping now.\" Panic surged as she tried to turn off the AVR, but it was too late. The light
            \t\tfrom her monitor enveloped her, sucking her into the game. \"Welcome to CIT-U, player 5!\"
            \t\tthe screen announced, marking the start of Kamadan's challenging journey through three
            \t\tconnected kingdoms, each filled with secrets and trials that would test her coding skills,
            \t\tproblem-solving abilities, and resilience.\n
        """);


        simulateTyping("""
            \t\tKamadan found herself in the dimly lit alleys of Third Street, where the smell of alcohol
            \t\tand sadness filled the air. Due to her curiosity, she started to wander around the place and
            \t\tsaw a big piece of vandalism on the wall with the saying, \""Study hard, party harder!\"
            \t\tHere, she will encounter her first challenge: the Drunkard Minions—three chaotic foes who
            \t\twere once students like her, now trapped in a cycle of partying and regret.\n
        """);

        simulateTyping("""
            \t\tAs Kamadan navigated the dim streets of Third Street, her heart raced with nervousness amid
            \t\tthe thick air of alcohol and regret. She spotted three familiar figures: Boozy, Sloshed, and
            \t\tJager. Once fellow students, now trapped in a cycle of nightlife and despair. Just as she
            \t\tapproached, a large holographic screen lit up, presenting her first quest: \"Escape the Haze of Regret\".\n
        """);
    }

    public void questOne() {
        System.out.println( "============================================================================================================================");
        simulateTyping("||                                          Quest #1: Escape the Haze of Regret.                                          ||\n");
        simulateTyping("||                      Objective: You must defeat the three minions by tackling coding challenges.                       ||\n");
        simulateTyping("||                                Each minion represents a coding struggle from your past.                                ||\n");
        System.out.println( "============================================================================================================================");

        simulateTyping("\tSuccess would not only mean overcoming challenges but also offer a chance to escape this strange game world.\n\n");
    }
    
    public void unlockKey(){
        System.out.println("||                   Congratulations! You have scored an ID for taking down the minions in ThirdStreet.                   ||");
        System.out.println("||                                      ID NUMBER: (6 - 3) 4 + 58 - 3 + (10 * 7 + 6)                                      ||");
        System.out.println( "============================================================================================================================\n");
    }
    

    int gate;
    public int enterGate() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("============================================================================================================================");
                System.out.println("||                                   Enter your ID NUMBER to enter SI IT YOU? Kingdom                                     ||");
                System.out.print("||                                                      ID NUMBER: ");
                gate = scanner.nextInt(); 
                return gate;
            }catch(Exception e){
                scanner.next();
                System.out.println("||                                          Invalid Input. Please Try Again.                                              ||");
                System.out.println("============================================================================================================================");

            }
        }
    }
    
    public void secondNarration(){
        simulateTyping("""
            \t\t\tKamadan felt a surge of determination; defeating the minions and solving their 
            \t\tcoding challenges using her skills would earn her an ID a key symbolizing her progress 
            \t\tand a supposed ticket to escape the game. Confident that completing this first quest 
            \t\twould lead her back to reality, she prepared herself for battle, though an unsettling
            \t\tfeeling lingered, making her question if defeating the minions alone would be enough for 
            \t\tfreedom. Her mind raced with thoughts of escape, unaware that the path ahead would tunveil 
            \t\tdeeper layers of the game and the trials that awaited in the next kingdom, SI IT YOU?.

            \t\tBefore reaching the gates of SI IT YOU?, Kamadan discovered a sari-sari store, a beloved 
            \t\tspot for local students. The store owner, Chizmosa, informed her that only those who 
            \t\tdemonstrated their coding skills could advance, as two generals guarded the path ahead. As
            \t\ta reward, Kamadan unlocked a new character, \"Altreia,\" to assist her on her journey. To enter 
            \t\tSI IT YOU?, she needed to input her ID number before entering the next kingdom.\n
        """);
    }



    public void questTwo() {
        System.out.println("============================================================================================================================");
        simulateTyping("||                                            Quest #2: Preserve the Legacy.                                              ||\n");
        simulateTyping("||              Objective: Stop the wandering spirits from Third Street that threaten to spread ignorance by              ||\n");
        simulateTyping("||                         distorting coding and IT principles. You must encapsulate this vital knowledge,                ||\n");
        simulateTyping("||                         restricting access to only trusted individuals and blocking the spirits' influence.            ||\n");
        simulateTyping("||                         Beware of the loopholes they have created in ancient coding wisdom, as they allow              ||\n");
        simulateTyping("||                         misinformation to spread. Protect this knowledge to ensure future generations can              ||\n");
        simulateTyping("||                         access the truth.                                                                              ||\n");
        System.out.println("============================================================================================================================");
    
        simulateTyping("\tUpon defeating the generals, you will unlock a new character named Shang, who will aid you in your journey.\n\n");
    }
    
    public void thirdNarration(){
        //shangUnlock();
        System.out.println("============================================================================================================================\n");
        simulateTyping("""
            \t\t\tFinally, Kamadan and her friends arrive at the grand gates of Si CS, where the ultimate  
            \t\ttest awaits. The formidable Khaiamanan, her real-life OOP 1 professor, stands as the final boss.
            \t\tKnown for his tough teaching style, Khaiamanan challenges them with complex coding 
            \t\tproblems and logic behind data structures.\n
        """);
    }

    public void questThree() {
        System.out.println("============================================================================================================================");
        simulateTyping("||                                            Quest #3: The Final Exam                                                    ||\n");
        simulateTyping("||              Objective: Kamadan and her team must protect essential coding principles from the wandering               ||\n");
        simulateTyping("||                         spirits of Third Street. By encapsulating vital knowledge and restricting access               ||\n");
        simulateTyping("||                         to trusted allies, they will block the spirits\' influence and preserve the truth for           ||\n");
        simulateTyping("||                         future generations.                                                                            ||\n");
        System.out.println("============================================================================================================================\n");
        }
        public void altreiaUnlock(){
            System.out.println("\t\t\t\t=========================================================================");
            System.out.println("\t\t\t\t||               Congratulations! You have now unlocked:               ||");
            System.out.println("\t\t\t\t||            █████╗ ██╗  ████████╗██████╗ ███████╗██╗ █████╗          ||");
            System.out.println("\t\t\t\t||           ██╔══██╗██║  ╚══██╔══╝██╔══██╗██╔════╝██║██╔══██╗         ||");
            System.out.println("\t\t\t\t||           ███████║██║     ██║   ██████╔╝█████╗  ██║███████║         ||");
            System.out.println("\t\t\t\t||           ██╔══██║██║     ██║   ██╔══██╗██╔══╝  ██║██╔══██║         ||");
            System.out.println("\t\t\t\t||           ██║  ██║███████╗██║   ██║  ██║███████╗██║██║  ██║         ||");
            System.out.println("\t\t\t\t||           ╚═╝  ╚═╝╚══════╝╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝         ||");
            System.out.println("\t\t\t\t=========================================================================");
        }
    
        public void shangUnlock(){
            System.out.println("\t\t\t\t=========================================================================");
            System.out.println("\t\t\t\t||               Congratulations! You have now unlocked:               ||");
            System.out.println("\t\t\t\t||            ███████╗██╗  ██╗ █████╗ ███╗   ██╗ ██████╗               ||");
            System.out.println("\t\t\t\t||            ██╔════╝██║  ██║██╔══██╗████╗  ██║██╔════╝               ||");
            System.out.println("\t\t\t\t||            ███████╗███████║███████║██╔██╗ ██║██║  ███╗              ||");
            System.out.println("\t\t\t\t||            ╚════██║██╔══██║██╔══██║██║╚██╗██║██║   ██║              ||");
            System.out.println("\t\t\t\t||            ███████║██║  ██║██║  ██║██║ ╚████║╚██████╔╝              ||");
            System.out.println("\t\t\t\t||            ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝               ||");
            System.out.println("\t\t\t\t=========================================================================");
        }
        public void gameover(){
            System.out.println(" ░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓██████████████▓▒░░▒▓████████▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░  ");
            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println("░▒▓█▓▒▒▓███▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░  ");
            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println("░▒▓██████▓▒░░ ▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓██████▓▒░   ░▒▓██▓▒░  ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░ ");
                            
        }

}