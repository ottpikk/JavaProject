package basic2;

import java.util.Scanner;

public class EasyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] childNames = new String[3];
        // setting element value by referring to element's index
        childNames[0] = "Toomas";
        childNames[1] = "Tiit";
        System.out.println("Enter 3rd child name:");
        childNames[2] = scanner.next();


        //Getting values for some elements
        System.out.print(childNames[0]+ " ");
        System.out.print(childNames[1]+ " ");
        System.out.print(childNames[2]+ " \n");

        // Second way to declare and give values
        String[] dreamCars = new String[]{"BMW", "Lamborghini", "VW"};

        System.out.println(dreamCars[0]);
        System.out.println(dreamCars[1]);
        System.out.println(dreamCars[2]);


        //in data type array
        int[] age = new int[4];
        age[0] = 5;
        age[3] = 12;
        age[1] = 24;
        age[2] = 64;

        System.out.println(age[0]);
        for (int i =0; i < age.length;i++) {
            System.out.println("Element with index "+i+" is "+age[i]);
        }
        System.out.println("Element with index 2 is "+age[2]);
        System.out.println(age[0] +", "+ age[1] +", "+ age[2] +", "+ age[3]);
        System.out.println(age[3] + age[0]);


    }
}
