package writingtofiles;

import java.lang.reflect.Array;

public class FibonacciNumber {
    private static FibonacciNumber number;
    private long[] fibNumbers;

    public FibonacciNumber(){
        this.fibNumbers = fibNumbers;
    }

    public  static long[] FibonacciNumbers(){

        long[] fibNumbers = new long[50];
        Array.set(fibNumbers,0,0);
        Array.set(fibNumbers,1,1);

        for (int i = 2; i < Array.getLength(fibNumbers); i++){
            long a = (long)Array.get(fibNumbers,(i-1));
            long b = (long)Array.get(fibNumbers,(i-2));
            Array.set(fibNumbers,i,(a+b));

        }
        return fibNumbers;
    }


}
