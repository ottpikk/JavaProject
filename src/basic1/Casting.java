package basic1;

public class Casting {

    public static void main(String[] args) {

        // CONVERSION
       /* int i = 25;
        float j = i;  // int and float, both are 4 bytes -> automatic conversion
        System.out.println(j);  // prints 25.0

        long k = i;  // all smaller data types fit to the bigger ones
        System.out.println(k);
       */ // int l = k;   // bigger data type can not fit into smaller one
        /*
        * boolean -> 1 bit
        * byte -> 1 byte
        * short -> 2 bytes
        * char -> 2 bytes
        * int -> 4 bytes
        * float -> 4 bytes
        * long -> 8 bytes
        * double -> 8 bytes
        */

        // CASTING

        float temperature = 127.6f;
        //byte newTemp = (byte)temperature;
        //System.out.println("Casting from float to byte "+temperature +" -> "+newTemp);

        float num = 45.6734f;
        String text = " garage";
        System.out.printf("I have %.2f new thing in my %s. ", num,text   );

    }
}
