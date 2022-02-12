package advanced1.hT220206;

class Car extends Vehicle{
    private boolean airConditioner;

    public Car(double fuel, double fuelUsage, int passengers, boolean airConditioner){
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }


    public float maxDistance() {


        if (airConditioner){
            fuelUsage = 1.1f * (fuelUsage + (fuelUsage * passengers * 0.05f));
        } else {
            fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f) ;
        }
        float maxDistance = fuel / fuelUsage * 100;
        return maxDistance;
    }
}