package classTasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(myArray));

        int[] reversedArray = new int[myArray.length];

        // First solution
        for(int i = 0; i < myArray.length; i++){
            reversedArray[i] = myArray[myArray.length-1-i];
        }
        System.out.println(Arrays.toString(reversedArray));


        // Second solution
        for (int i = 0; i < myArray.length / 2 ; i++){
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArray));

    }
}
