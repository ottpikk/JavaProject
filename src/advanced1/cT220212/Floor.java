package advanced1.cT220212;

public class Floor {

    //Fields
    protected double length;
    protected double width;

    //Custom constructor
    public Floor(double width, double length){
        if (width > 0){
            this.width = width;
        } else {
            this.width = 0;
        }
        if (length > 0){
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    //Method
    public double getArea(){
        return (width * length);
    }
}
