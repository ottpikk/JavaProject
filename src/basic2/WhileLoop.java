package basic2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Insert amount");
        int amount = scanner.nextInt();
        int count = 0;
        while (count < amount) {
            System.out.println("Hello World");
            count++;
        }*/

        char letter = 'y';
        while(letter == 'y') {
            System.out.println("Hello World");
            System.out.println("Do you want to run again? (y/n)");

            letter = scanner.next().charAt(0);
        }


    }
}
