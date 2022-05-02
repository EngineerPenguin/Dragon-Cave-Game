import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Text to start the story
        System.out.println("Your are in a land full of dragons. In front of you,\n" +
                "and will share his treasure with you. The other drgaon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2): ");
        //scanner for user input
        Scanner in = new Scanner(System.in);
        int userChoice = in.nextInt();
        System.out.println("You chose " + userChoice);
         //if else statment to display different options
        if (userChoice == 1){
            System.out.println("You approach the cave...\n" +
                    "it's dark and spooky..\n" +
                    "A large dragon leaps out in front of you! He opens his jaws and...\n" +
                    "gobbles you down in one bite!");
        
        } else if(userChoice == 2) {
            System.out.println("You approach the cave...\n" +
                    "it's dark and spooky..\n" +
                    "A large dragon leaps out in front of you! He opens his jaws and...\n" +
                    "Sneezes and lays back down, you continue onward.");
        //error catching incase 1 or 2 is not typed
        } else {
            System.out.println("Err Code: Cheese. Please input '1' or '2'");
        }
    }
}
