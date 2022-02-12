package advanced1;

import java.util.Scanner;

class Vehicle{
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public double maxDistance(){
        fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f) ;
        double maxDistance = (double)Math.round(100 * fuel / fuelUsage * 100)/100;
        return maxDistance;
    }

    public Vehicle(double fuel, double fuelUsage, int passengers){
        this.fuel = (float)fuel;
        this.fuelUsage = (float)fuelUsage;
        this.passengers = passengers;
    }
}

class Car  extends Vehicle{
    private boolean airConditioner;

    public Car(double fuel, double fuelUsage, int passengers, boolean airConditioner){
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }


    public double maxDistance() {

        if (airConditioner){
            fuelUsage = 1.1f * (fuelUsage + (fuelUsage * passengers * 0.05f));
        } else {
            fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f) ;
        }
        double maxDistance = (double)Math.round(100 * fuel / fuelUsage * 100)/100;
        return maxDistance;
    }
}

public class MaximumDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in tank:");
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

        System.out.println("1. With parameters you entered     - " +car3.maxDistance()+ " km");
        System.out.println("2. Without passengers, with A/C    - " +car4.maxDistance()+ " km");
        System.out.println("3. With passengers, without A/C    - " +car2.maxDistance()+ " km");
        System.out.println("4. Without passengers, without A/C - " +car1.maxDistance()+ " km");




    }
}
