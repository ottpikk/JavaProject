package basic2;

import java.sql.Array;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First mini task - ask for array size + ask for int elements + return all elements
        System.out.println("Please enter number of elements");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i=0; i<=arraySize-1; i++){
            System.out.println("Enter array element for index "+i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++){
            System.out.print(array[i]+ " ");
        }


        // Second Task - ask array size + ask for int elements + return sum of elements
        System.out.println("\nEnter number of elements for second array");
        int array2Size = scanner.nextInt();
        int[] array2 = new int[arraySize];
        int arraySum = 0;

        for(int i=0; i<=array2Size-1 ;i++){
            System.out.println("Enter array member for index "+i);
            array2[i] = scanner.nextInt();
            arraySum += array2[i];
        }

        System.out.println("The sum of your array: "+arraySum);


    }
}
