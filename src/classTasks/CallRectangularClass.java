package classTasks;

import java.util.Scanner;

public class CallRectangularClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Rectangular
        Rectangular shape1 = new Rectangular();
        System.out.println("Give width for your Rectangle:");
        shape1.setWidth(scanner.nextInt());
        System.out.println("Give length for your Rectangle:");
        shape1.setLength(scanner.nextInt());

        System.out.println(shape1.getLength());
        System.out.println(shape1.getWidth());
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());

        float[] rectLengths = {5, 14, 8, 29};
        float[] rectWidths = {8, 64, 17, 45};

        for (int i = 0; i < rectLengths.length; i++){
            shape1.setWidth(rectWidths[i]);
            shape1.setLength(rectLengths[i]);
            System.out.println((i+1) +". Rectangular:");
            System.out.println("\tArea: "+shape1.getArea()+ "  Perimeter: "+shape1.getPerimeter());
        }




    }
}
