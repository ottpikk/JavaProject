package BiblioAdvanced;

import java.util.Arrays;

public class AdvancedMethod {
    public static void main(String[] args) {

        int[] x = {5,4,3,2,1};      //declare array with 5 elements

        magic(x);                   //call magic method for x array
        System.out.println("main: " + Arrays.toString(x));  //print out new values
    }

    public static void magic (int input){
        input +=10;                         //method is never used
    }
    public static void magic (int[] input){
        for (int i = 0; i < input.length; i++){
            input[i] +=10;          //add 10 to each element in array
        }
    }
}
