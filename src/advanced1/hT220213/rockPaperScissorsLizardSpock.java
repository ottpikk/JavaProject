package advanced1.hT220213;

import java.util.Scanner;

public class rockPaperScissorsLizardSpock extends rockPaperScissors{
    String player = "player";

    int choice1;
    int choice2;
    String choice11;
    String choice21;
    Scanner scanner = new Scanner(System.in);
    gameType game = new gameType();


    public void rockPaperScissorsLizardSpock() {

        game.gameType();

        if (game.player1.equals(player)){
            System.out.println(" Player 1 please enter your choice! ");
            System.out.println(" Rock / Paper / Scissors / Lizard / Spock");
            this.choice11 = (scanner.nextLine().toLowerCase());
        }
        if (game.player2.equals(player)){
            System.out.println(" Player 2 please enter your choice! ");
            System.out.println(" Rock / Paper / Scissors / Lizard / Spock");
            this.choice21 = (scanner.nextLine().toLowerCase());
        }

        gameLogic();
        System.out.printf("Player 1 chose %s and player 2 chose %s\n", result(choice1), result(choice2));
        System.out.println("\nMake your choice:\n\t1. Play again\n\t2. Exit");
        int menu = scanner.nextInt();
        scanner.nextLine();
        while (menu == 1){
            rockPaperScissorsLizardSpock();
        }

    }

    public void gameLogic(){

        String scissors = "scissors";
        String rock = "rock";
        String paper = "paper";
        String lizard = "lizard";
        String spock = "spock";

        if (game.player1.equals("player")){
            if (choice11.equals(scissors)){
                this.choice1 = 0;
            } else if (choice11.equals(rock)){
                this.choice1 = 1;
            } else if (choice11.equals(paper)){
                this.choice1 = 2;
            } else if (choice11.equals(lizard)){
                this.choice1 = 3;
            } else {
                this.choice1 = 4;
            }
        } else {
            this.choice1 = (int)Math.round(4* Math.random());
        }
        if (game.player2.equals("player")) {
            if (choice21.equals(scissors)){
                this.choice2 = 0;
            } else if (choice21.equals(rock)){
                this.choice2 = 1;
            } else if (choice21.equals(paper)){
                this.choice2 = 2;
            } else if (choice21.equals(lizard)){
                this.choice2 = 3;
            } else {
                this.choice2 = 4;
            }
        } else {
            this.choice2 = (int)Math.round(4 * Math.random());
        }

        if (choice1 == 0 && ( choice2 == 2 || choice2 == 3)){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == 1 && (choice2 == 0 || choice2 == 3)){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == 2 && (choice2 == 1 || choice2 == 4)){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == 3 && (choice2 == 2 || choice2 == 4)){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == 4 && (choice2 == 0 || choice2 ==1)){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == choice2){
            System.out.println("It's a draw");
        } else {
            System.out.println("Player 2 wins");
        }
    }

    public String result(int choice1){
        String result ="";
        switch (choice1){
            case 0:
                result = "SCISSORS";
                break;
            case 1:
                result = "ROCK";
                break;
            case 2:
                result = "PAPER";
                break;
            case 3:
                result = "LIZARD";
                break;
            case 4:
                result = "SPOCK";
                break;

        } return result;
    }


}
