package advanced1.cT220206;

class Rectangular {
    protected float length;
    protected float width;

    public void area(){
        System.out.println("Area: " + length * width);
    }
    public void perimeter(){
        System.out.println("Perimeter: " + 2 * (length + width));
    }
    public void Rectangular(float length, float width){
        this.length = length;
        this.width = width;
    }
}

class Square extends Rectangular{
    private float side;

    public void Square(float side) {
        this.side = side;
        super.Rectangular(side,side);
    }

    public float getSide(){
        System.out.println(length);
        System.out.println(width);
        return side;
    }
}


public class Geometry {
    public static void main(String[] args) {

        Rectangular rec1 = new Rectangular();
        rec1.Rectangular(45,12);
        rec1.area();
        rec1.perimeter();
        System.out.println();

        Square square1 = new Square();
        square1.Square(8);
        square1.area();
        square1.perimeter();
        square1.getSide();

    }
}
