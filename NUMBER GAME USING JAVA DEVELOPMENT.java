import java.util.Random;
import java.util.Scanner;

public class Dharmendra_task1_questions {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        System.out.println(randomNumber);
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the number between " + min + " and " + max + ": ");
        int limitedAttemps = 3;

        limitedAttemps = multipleRounds(limitedAttemps, randomNumber);

        // Ask to user about they want to play again
        while(true) {
            System.out.println();
            System.out.println("  --  --  --  --  --  --  --  --");
            System.out.print("If you want to play again then type 'Y' or 'y'. If you don;t want then type 'N' or 'n':  ");
            char userOpinion = input.next().trim().charAt(0);
            if(userOpinion == 'Y' || userOpinion == 'y') {
                System.out.println();
                System.out.println("Play again your another round, best of luck!");
                limitedAttemps += 3;
                limitedAttemps = multipleRounds(limitedAttemps, randomNumber);
            } else {
                break;
            }
        }

        // Print the statement if your no.of limited Attemps are completed!
        if(limitedAttemps == 0) {
            System.out.println("And the Correct number is "+ randomNumber);
        }
    }

    private static int multipleRounds(int limitedAttemps, int randomNumber) {
        Scanner input = new Scanner(System.in);
        while(limitedAttemps > 0) {
            int userGuess = input.nextInt();
            limitedAttemps -= 1;
            if(userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break;
            } else {
                if(limitedAttemps == 0) {
                    System.out.println("You have NO more chances. Next time better luck");
                } else {
                    System.out.println("Sorry, you have entered wrong numbers. You have "+ limitedAttemps +" more chances to guess correct number");
                    System.out.println();
                }
            }
        }

        return limitedAttemps;
    }
}
