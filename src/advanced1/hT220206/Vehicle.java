package advanced1.hT220206;

class Vehicle{
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(double fuel, double fuelUsage, int passengers){
        this.fuel = (float)fuel;
        this.fuelUsage = (float)fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance(){
        fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f) ;
        float maxDistance = fuel / fuelUsage * 100;
        return maxDistance;
    }
}





