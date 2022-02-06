package advanced1;

class Vehicle{
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public void maxDistance(){
        fuelUsage = fuelUsage + (fuelUsage * passengers * (float)0.05) ;
        double maxDistance = (double)Math.round(100 * fuel / fuelUsage * 100)/100;
        System.out.println("Possible maximum distance: " + maxDistance + " km");
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

    @Override
    public void maxDistance() {

        if (airConditioner){
            fuelUsage = (float)1.1 * (fuelUsage + (fuelUsage * passengers * (float)0.05));
        } else {
            fuelUsage = fuelUsage + (fuelUsage * passengers * (float)0.05) ;
        }
        double maxDistance = (double)Math.round(100 * fuel / fuelUsage * 100)/100;
        System.out.println("Possible maximum distance: " + maxDistance + " km");
    }
}

public class MaximumDistance {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(55.5,5.55,0);
        vehicle1.maxDistance();

        Vehicle vehicle2 = new Vehicle(55.5,5.5,5);
        vehicle2.maxDistance();

        Car car1 = new Car(70.0,7.0,0,true);
        car1.maxDistance();

        Car car2 = new Car(70.0,7.0,0,false);
        car2.maxDistance();

    }
}
