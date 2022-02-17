package advanced1.hT220213;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static int to100 = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PLEASE WAIT, LOADING...\n");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.print("\t"+to100);
                to100 += 5;
                if (to100 == 50){
                    System.out.print("\tWOAH, your computer is slow..  :D");
                }
                if (to100 == 105){
                    System.out.println();
                    timer.cancel();
                    System.out.println("\n\n\t\tCHOOSE YOUR GAME:");
                    System.out.println("\t(enter the number of your choice)");
                    System.out.println();
                    System.out.println("\t1.\tRock, Paper, Scissors");
                    System.out.println("\t2.\t.....");
                }
            }
        },2,1000);


        rockPaperScissors newGame = new rockPaperScissors();

        int game = scanner.nextInt();

        switch (game){
            case 1:
                newGame.rockPaperScissors();
                break;
            case 2:
                break;
        }






    }
}
