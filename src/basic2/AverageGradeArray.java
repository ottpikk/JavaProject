package basic2;

import java.util.Scanner;

public class AverageGradeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of this array ::");
        int arraySize = scanner.nextInt();
        Float[] array = new Float[arraySize];
        Float average = 0f;
        Float sum = 0f;

        System.out.println("Enter the elements of the array one by one");

        for(int i=0; i <= arraySize-1; i++){
            System.out.println("Please enter element number: " +(i+1));
            array[i] = scanner.nextFloat();
            sum += array[i];
            average = sum/arraySize;

        }
        System.out.println("Average grade: "+average);
        System.out.println("There was passed " +arraySize+ " values");
    }
}
