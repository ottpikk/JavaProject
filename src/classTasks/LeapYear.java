package classTasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        String textAnswer = determinLeapYear(year); //call String type method
        System.out.println(textAnswer);
        determineLeapYear(year);  //call void type method
    }

    //Method with returning type void
    public static void determineLeapYear(int year){

        if (year %400 == 0 || (year %4 == 0 && year %100 != 0)){
            System.out.println(year +" is leap year");
        } else {
            System.out.println(year+ " is not a leap year");
        }
    }


        //Method with return type String
    public static String determinLeapYear(int year){


        if (year %400 == 0 || (year %4 == 0 && year %100 != 0)){
            return year +" is leap year";
        } else {
            return year+ " is not a leap year";
        }
    }

}
