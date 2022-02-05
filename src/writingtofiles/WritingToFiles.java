package writingtofiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;

import static java.lang.System.out;

public class WritingToFiles {

    public static void main(String[] args) {



        try {
            PrintStream ps = new PrintStream("ps.txt");
            FileWriter out = new FileWriter("out.txt");
            //out = new FileWriter("out.txt");
            for (int i = 0; i < Array.getLength(FibonacciNumber.FibonacciNumbers());i++) {
               // ps.write(String.valueOf(Array.get(FibonacciNumber.FibonacciNumbers(),i)));
                ps.write('a');

            }
            for (int i = 0; i < Array.getLength(FibonacciNumber.FibonacciNumbers());i++) {
                out.write(String.valueOf(Array.get(FibonacciNumber.FibonacciNumbers(),i)));
                System.out.println(Array.get(FibonacciNumber.FibonacciNumbers(),i));
                out.write("tere");
                out.write("tere");
                out.write("tere");

            }


        } catch (IOException e){
            System.err.println("File writer failed.");
        }



    }
}
