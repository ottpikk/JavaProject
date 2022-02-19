package advanced1.hT220213;

import java.util.Locale;
import java.util.Scanner;

public class karlisSample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Classical enter 1 or BigBang enter 2");
        int version = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter Player's 1 choice");
        String player1 = scanner.nextLine().toLowerCase().trim(); //trim() deletes empty spaces
        System.out.println("Please enter Player's 2 choice");
        String player2 = scanner.nextLine().toLowerCase().trim();

        if (version == 1){
            System.out.println(rockPaperScissors(player1,player2));
        } else if (version == 2){
            System.out.println(rockPaperScissorsLizardSpock(player1,player2));
        } else {
            System.out.println("Version was not valid");
        }

    }

    public static String rockPaperScissors(String player1, String player2){
        String answer;
        if (!checkInputValid(player1, player2)){
            return "Input values are not valid";
        }

        if (player1.equals("paper")     && player2.equals("rock")
         || player1.equals("scissors")  && player2.equals("paper")
         || player1.equals("rock")      && player2.equals("scissors")){
            answer = "Player 1 wins";
        } else if (player1.equals(player2)){
            answer = "It's a tie";
        } else {
            answer = "Player 2 wins";
        }
        return answer;
    }

    public static String rockPaperScissorsLizardSpock(String player1, String player2){
        String answer;
        if (!checkValidLizardSpock(player1, player2)){
            return "Input values are not valid";
        }
        if (player1.equals("paper")     && (player2.equals("rock") || player2.equals("spock"))
         || player1.equals("scissors")  && (player2.equals("paper") || player2.equals("lizard"))
         || player1.equals("rock")      && (player2.equals("scissors") || player2.equals("lizard"))
         || player1.equals("lizard")    && (player2.equals("paper") || player2.equals("spock"))
         || player1.equals("spock")    && (player2.equals("rock") || player2.equals("lizard"))){
            answer = "Player 1 wins";

        } else if (player1.equals(player2)){
            answer = "It's a tie";

        } else {
            answer = "Player 2 wins";
        }
        return answer;
    }

    public static boolean checkInputValid(String player1, String player2){
        return player1.matches("rock|scissors|paper") && player2.matches("rock|scissors|paper");
    }

    public static boolean checkValidLizardSpock(String player1, String player2){
        return player1.matches("rock|scissors|paper|lizard|spock") && player2.matches("rock|scissors|paper|lizard|spock");
    }
}
