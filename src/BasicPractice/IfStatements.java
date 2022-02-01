package BasicPractice;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input some number: ");
        int input = scanner.nextInt();
        System.out.println(input);
        if (input > 10){
            System.out.println("More");
        } else {
            System.out.println("Less");
        }

        String inputString = scanner.next();
        if (inputString.equals("password")){
            System.out.println("Correct");
        } else if (inputString.contains("qwe")){
            System.out.println("your input contains qwe");
        } else {
            System.out.println("no logic");
        }





    }
}
