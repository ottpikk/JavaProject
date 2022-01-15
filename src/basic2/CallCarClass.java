package basic2;


public class CallCarClass {
    public static void main(String[] args) {

        //Create new object
        Car car1 = new Car();

        //Assign values to object fields
        //car1.brand = "Ford";
        car1.setBrand("Ford");
        car1.setColor("Red");
        car1.setMaxSpeed(260);

        //Access object values
        System.out.println(car1.getBrand());

        Car car2 = new Car();
        car2.setMaxSpeed(240);
        car2.setColor("Black");
        car2.setBrand("Volvo");


        car1.printInfo();
        car2.printInfo();




    }
}
