package basic2;

public class MathClass {
    public static void main(String[] args) {

        float num = -5.4f;
        int num1 = 8;

        // Max value
        System.out.println(Math.max(num, num1));

        // Min value
        System.out.println(Math.min(num, num1));

        // Rounding
        // Round up
        System.out.println(Math.ceil(num));
        // Round down
        System.out.println(Math.floor(num));
        // Rounding according to common math rules
        System.out.println(Math.round(num));

        // ABS
        System.out.println(Math.abs(num));

        // sqrt
        System.out.println(Math.sqrt(num1));

        // Random
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100));



    }
}
