package advanced1.hT220213;

import java.util.Scanner;

public class rockPaperScissors {
    String player = "player";

    int choice1;
    int choice2;
    String choice11;
    String choice21;
    Scanner scanner = new Scanner(System.in);
    gameType game = new gameType();


    public void rockPaperScissors() {
        game.gameType();

        if (game.player1.equals(player)){
            System.out.println(" Player 1 please enter your choice! ");
            System.out.println(" Rock / Paper / Scissors");
            this.choice11 = (scanner.nextLine().toLowerCase());
        }
        if (game.player2.equals(player)){
            System.out.println(" Player 2 please enter your choice! ");
            System.out.println(" Rock / Paper / Scissors");
            this.choice21 = (scanner.nextLine().toLowerCase());
        }
        gameLogic();
    }

    public void gameLogic(){

        String scissors = "scissors";
        String rock = "rock";
        //String paper = "paper";

        if (game.player1.equals("player")){
            if (choice11.equals(scissors)){
                this.choice1 = 0;
            } else if (choice11.equals(rock)){
                this.choice1 = 1;
            } else {
                this.choice1 = 2;
            }
        } else {
            this.choice1 = (int)Math.round(2* Math.random());
        }
        if (game.player2.equals("player")) {
            if (choice21.equals(scissors)){
                this.choice2 = 0;
            } else if (choice21.equals(rock)){
                this.choice2 = 1;
            } else {
                this.choice2 = 2;
            }
        } else {
            this.choice2 = (int)Math.round(2 * Math.random());
        }

        if (choice1 == 0 && choice2 == 2){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == 1 && choice2 == 0){
            System.out.println("Player 1 wins!!");
        } else if (choice1 == 2 && choice2 == 1){
            System.out.println("Player 1 wins!!");
        }else if (choice1 == choice2){
            System.out.println("It's a draw");
        } else {
            System.out.println("Player 2 wins");
        }
    }



}
