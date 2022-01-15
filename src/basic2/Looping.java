package basic2;

import java.util.Objects;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.println("Enter first number:");
            num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            num2 = scanner.nextInt();
            System.out.println("\nchoose task (1/2/3/4):" +
                    "       \n1 \tAddition" +
                    "       \n2 \tSubtraction" +
                    "       \n3 \tMultiplication" +
                    "       \n4 \tDivision\n");
            int task = scanner.nextInt();

            switch (task){
                case 1:
                    getSum(num1, num2);
                    break;
                case 2:
                    getSubs(num1, num2);
                    break;
                case 3:
                    getMulti(num1, num2);
                    break;
                case 4:
                    getDivide(num1, num2);
                    break;
                default:
                    num2 =0;
            }
            System.out.println("\nDo you wish to do more calculations? (y / n)");
            String end = scanner.next();
            if (Objects.equals(end, "n")){
                num1 = 0;
                num2 = 0;
                System.out.println("Bye Bye !!");
            } else {
                num1 = 1;
            }

        } while (num1 != 0 && num2 != 0);
    }
    static void getSum(int num1, int num2){
        System.out.println(num1+" + "+num2+" = "+(num1 + num2));
    }
    static void getSubs(int num1, int num2){
        System.out.println(num1+" - "+num2+" = "+(num1 - num2));
    }
    static void getMulti(int num1, int num2){
        System.out.println(num1+" x "+num2+" = "+num1 * num2);
    }
    static void getDivide(int num1, int num2){
        double divide = 1.0;
        System.out.println(num1+" / "+num2+" = "+divide*num1 / num2);
    }

}
