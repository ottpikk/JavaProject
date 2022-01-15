package basic1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your name");
        String name = scanner.next();

        int age = 2021 - birthYear;
        Calendar calendar = Calendar.getInstance();

        System.out.println("Your name is " +name+ " and you are " +age+ " old");
        System.out.println("Your name is " +name+ " and you are " +(2021-birthYear)+ " old");
        System.out.println("Your name is " +name+ " and you are " +((calendar.get(Calendar.YEAR))-birthYear)+ " old");




    }
}
