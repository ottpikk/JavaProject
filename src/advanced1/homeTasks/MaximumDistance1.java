package advanced1.homeTasks;

import java.util.Scanner;

public class MaximumDistance1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your car:");
        float fuel = scanner.nextFloat();
        System.out.println("Enter your car fuel usage (l/100km):");
        float fuelUsage = scanner.nextFloat();
        System.out.println("Enter number of passengers:");
        int passengers = scanner.nextInt();
        System.out.println("Is your A/C running? (y / n)");
        boolean airConditioner = scanner.next().charAt(0) == 'y';

        Car car3 = new Car(fuel,fuelUsage,passengers,airConditioner);
        Car car1 = new Car(fuel,fuelUsage,0,false);
        Car car2 = new Car(fuel,fuelUsage,passengers,false);
        Car car4 = new Car(fuel,fuelUsage,0,airConditioner);

        System.out.println("Your car can drive:");

        System.out.printf("1. With parameters you entered     - %.2f km \n", car3.maxDistance());
        System.out.printf("2. Without passengers, with A/C    - %.2f km \n", car4.maxDistance());
        System.out.printf("3. With passengers, without A/C    - %.2f km \n", car2.maxDistance());
        System.out.printf("4. Without passengers, without A/C - %.2f km", car1.maxDistance());




    }
}