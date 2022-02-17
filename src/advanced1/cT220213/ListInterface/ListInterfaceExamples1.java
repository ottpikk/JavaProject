package advanced1.cT220213.ListInterface;

import java.util.ArrayList;

public class ListInterfaceExamples1 {
    public static void main(String[] args) {

        // ArrayList

        ArrayList<String> car = new ArrayList<String>();

        //Add values
        car.add("Volvo");
        car.add("Audi");
        car.add("Mercedes");
        car.add("Ford");
        car.add("Jeep");
        car.add("Opel");
        car.add("Renault");
        car.add("Ford");

        //Print out
        System.out.println(car);

        //Add elements at specific index
        car.add(0,"Ford");
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(1));
        for (int i = 0; i < car.size();i++){
            System.out.println(car.get(i));
        }

        //Change element value
        car.set(0,"Toyota");
        System.out.println(car);

        //Remove element by index
        car.remove(3);
        System.out.println(car);

        //Remove all
        car.removeAll(car);
        System.out.println(car);

    }
}
