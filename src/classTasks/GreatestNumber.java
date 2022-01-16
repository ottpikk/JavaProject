package classTasks;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Enter three numbers one by one");

        for (int i = 0; i < 3; i++){
            System.out.println("Enter " +(i+1)+ ". number");
            array[i] = scanner.nextInt();
        }

        System.out.println(Math.max(Math.max(array[0],array[1]),array[2]));


    }
}
