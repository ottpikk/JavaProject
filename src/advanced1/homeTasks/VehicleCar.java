package advanced1.homeTasks;

import java.util.Scanner;

class Vehicle{
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(double fuel, double fuelUsage, int passengers){
        this.fuel = (float)fuel;
        this.fuelUsage = (float)fuelUsage;
        this.passengers = passengers;
    }

    public double maxDistance(){
        fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f) ;
        float maxDistance = fuel / fuelUsage * 100;
        return maxDistance;
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
        float maxDistance = fuel / fuelUsage * 100;
        return maxDistance;
    }
}



