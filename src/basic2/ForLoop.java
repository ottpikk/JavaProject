package basic2;


import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        // for loop

        for(int i = 0; i < 10; i++) {
            if(i < 9) {
                System.out.println("i value is " +i);
                i++;
            } else {
                System.out.println("the value of i has reached " +i+ " and loop has ended");
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();

        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = -1; i >= num; i--) {
                System.out.print(i + " ");
            }
        }


        System.out.println("\n Enter another number");
        num = scanner.nextInt();

        for (int i = num; i >0; i--) {
            System.out.print(i+ " ");
            if (i <= num/2) {
                break;
            }
        }
    }
}
