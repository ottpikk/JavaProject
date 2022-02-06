package testing;

public class Factorial {

    public static int getFact(int input){

        int result = 1;
        if (input != 0) {
            for (int i = 1; i <= input; i++) {
                result *= i;
            }
        } else {
            result = 0;
        }

        return result;
    }
}
