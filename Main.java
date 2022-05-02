import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other drgaon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.print("Which cave will you go into? (1 or 2): ");

        Scanner in = new Scanner(System.in);
        int userChoice = in.nextInt();
        System.out.println("You chose " + userChoice);

        if (userChoice == 1){
            System.out.println("You approach the cave...");
            System.out.println("it's dark and spooky..");
            System.out.println("A large dragon leaps out in front of you! He opens his jaws and...");
            System.out.println("gobbles you down in one bite!");
        } else if(userChoice == 2) {
            System.out.println("You approach the cave...");
            System.out.println("it's dark and spooky..");
            System.out.println("A large dragon leaps out in front of you! He opens his jaws and...");
            System.out.println("Sneezes and lays back down.");
        } else {
            System.out.println("Err Code: Cheese. Please input '1' or '2'");
        }
    }
}