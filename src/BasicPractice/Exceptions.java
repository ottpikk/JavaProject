package BasicPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (true){
            try {
                System.out.println("Input a number: ");
                float input = scanner.nextFloat();
                System.out.println("You input the number: " + input);
                System.out.println("\r\n");
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a float number.");
                e.printStackTrace(System.out);
                System.out.println("\r\n");
            }
        }
    }
}
