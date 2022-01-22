package classTasks;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tree size");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++){
            //Spaces
            for (int j = 0; j < height -1 -i; j++){
                System.out.print(" ");
            }
            //Stars
            for (int k = 0; k < i * 2 +1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Base
        for (int l= 0; l <height - 1; l++){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
