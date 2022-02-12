package advanced1.cT220212;

public class Carpet {

    //Fields
    private double cost;

    public Carpet(double cost){
        if (cost > 0){
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    //Method
    public double getCost() {
        return cost;
    }
}
