package advanced1.cT220212;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (floor.getArea() * carpet.getCost());
    }

}
