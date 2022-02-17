package advanced1.hT220213;

import java.util.Scanner;

public class gameType {
    protected String player1;
    protected String player2;

    public void gameType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your game type:");
        System.out.println( "\n1. \tPlayer vs Player" +
                            "\n2. \tPlayer vs Computer" +
                            "\n3. \tComputer vs Computer");
        int choice = scanner.nextInt();
        scanner.nextLine();
        boolean ok = true;
        while (ok) {
            switch (choice) {
                case 1:
                    player1 = "player";
                    player2 = "player";
                    ok = false;
                    break;
                case 2:
                    player1 = "player";
                    player2 = "computer";
                    ok = false;
                    break;
                case 3:
                    player1 = "computer";
                    player2 = "computer";
                    ok = false;
                    break;
                default:
                    System.out.println("Input your number of choice (1-3");
                    ok = true;
                    choice = scanner.nextInt();
                    scanner.nextLine();

            }
        }
    }
}
