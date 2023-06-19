import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber;
        int userGuess;
        String playAgain;

        do {
            //Random number is generated and stored//
            generatedNumber = random.nextInt(10) + 1; //Have to do the plus 1 because the count would be 0-9, need to make sure 10 is included//

            //Get number from user and store it//
            System.out.println("Guess a number between 1 and 10:");
            userGuess = in.nextInt();

            //Check the results of the guess//
            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
            } else if (userGuess > generatedNumber) {
                System.out.println("Too high! The number was: " + generatedNumber);
            } else {
                System.out.println("Too low! The number was: " + generatedNumber);
            }

            //Ask if user wants to play again//
            System.out.println("DO you want to play again? Y/N");
            playAgain = in.next();

            //Repeat if the user wants to play again//
        }
        while (playAgain.equals("Y"));

    }
}