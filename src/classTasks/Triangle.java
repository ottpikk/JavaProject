package classTasks;

public class Triangle {
    //Fields
    private double side1;
    private double side2;
    private double side3;
    private double area;

    //Setter methods
    public void setSide1(double side1) { this.side1 = side1; }
    public void setSide2(double side2) { this.side2 = side2; }
    public void setSide3(double side3) { this.side3 = side3;
    }

    //Getter methods
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }


    private  boolean isValid(){
        return  side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }

    public double areaTriangle(){
        if (isValid()){
            double p = (side1+side2+side3) / 2;
            area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        } else {
           System.out.println("Triangle is not valid");
        }
        return area;
    }
}
