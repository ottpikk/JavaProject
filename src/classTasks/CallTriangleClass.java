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


        System.out.println(triangle1.areaTriangle());

    }
}
