package classTasks;

import java.util.Scanner;

public class AverageGradeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of this array ::");
        int arraySize = scanner.nextInt();
        float[] array = new float[arraySize];
        float average = 0f;
        float sum = 0f;

        System.out.println("Enter the grades one by one");

        for(int i=0; i <= arraySize-1; i++){
            System.out.println("Please enter grade number: " +(i+1));
            array[i] = scanner.nextFloat();
            sum += array[i];
            average = sum/arraySize;
        }

        System.out.println("Average grade: "+average);
        System.out.println("There was passed " +arraySize+ " grades");
    }
}
