package classTasks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max random range: ");
        int random = (int) (Math.random() * (scanner.nextInt() + 1));

        System.out.println("How many tries?");
        int guessCount = scanner.nextInt();
        System.out.println("Enter your number: ");
        int guess = scanner.nextInt();

        while (random != guess && guessCount > 0) {
            System.out.println("You have left "+ guessCount+ " tries");
            if (random > guess ) {
                System.out.println("Try bigger number ");
            } else if (random < guess ) {
                System.out.println("Try smaller one");
            }
            guess = scanner.nextInt();
            guessCount --;
        }

        if (guessCount > 0) {
            System.out.println("You guessed the right number in " + guessCount + " tries");
        } else {
            System.out.println("Sorry you lost !!");
            System.out.println("Correct random number was " +random);
        }
    }
}
