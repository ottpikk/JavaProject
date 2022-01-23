package classTasks;

import java.util.Scanner;

public class CallTriangleClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle triangle1 = new Triangle();
        System.out.println("Enter length for side 1:");
        triangle1.setSide1(scanner.nextDouble());
        System.out.println("Enter length for side 2:");
        triangle1.setSide2(scanner.nextDouble());
        System.out.println("Enter length for side 3:");
        triangle1.setSide3(scanner.nextDouble());


        System.out.println("Side 1: " +triangle1.getSide1());
        System.out.println("Side 2: " +triangle1.getSide2());
        System.out.println("Side 3: " +triangle1.getSide3());
        System.out.println("The area of the triangle you entered is: " +triangle1.areaTriangle());

    }
}
