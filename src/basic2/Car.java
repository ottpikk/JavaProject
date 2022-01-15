package basic2;

public class Car {
    // FIELDS - variables, that describe features of Class
    private String color;
    private int maxSpeed;
    private String brand;

    // METHODS - what Class can do, actions
    public void setBrand (String brand){
        this.brand = brand;
    }
    public void setColor (String color){
        this.color = color;
    }
    public void setMaxSpeed (int maxSpeed){
        this.maxSpeed = maxSpeed;
    }


    public String getBrand (){
        return brand;
    }
    public String getColor (){
        return brand;
    }
    public String getMaxSpeed (){
        return brand;
    }

    //Info method
    public void printInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Max speed: "+maxSpeed);

    }

    //Test comment for GIT

}
