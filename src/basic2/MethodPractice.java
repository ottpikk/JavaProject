package basic2;

import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[]{"Juku", "Miki", "Donald", "Tom"};
        System.out.println("choose your method :\n1 - Person info \n2- Array first line\n3 - Multi");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                printPersonInfo();
                break;
            case 2:
                System.out.println(getFirstLine(names));
                break;
            case 3:
                multi(24, 45);
        }
    }

    public static void printPersonInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String  name = scanner.next();
        System.out.println("Enter your birth year:");
        int year = scanner.nextInt();

        System.out.println("Hello " +name+ "you are " +(2021-year)+ " years old.");
    }
    public static String getFirstLine(String[] namesList){return namesList[2];}

    public static void multi(int num1, int num2){

        System.out.println(num1+"*"+num2+"="+num1 * num2);
    }

}

