package advanced1.cT220212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Floor size
        System.out.println("Please enter floor size");
        System.out.println("Enter floor length:");
        double length = scanner.nextDouble();
        System.out.println("Enter floor width");
        double width = scanner.nextDouble();
        Floor myRoom = new Floor(width, length);
        //carpet price
        System.out.println("Enter carpet price");
        double cost = scanner.nextDouble();
        Carpet persianCarpet = new Carpet(cost);
        //create object, get cost
        Calculator calculator = new Calculator(myRoom,persianCarpet);
        System.out.printf("Carpet will cost %.2f EUR",calculator.getTotalCost());
    }
}
