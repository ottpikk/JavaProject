package advanced1.i_o_buffering_cT220220;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        String test = "viimane";

        FileOutputStream out = new FileOutputStream("Data\\Output.txt", true);


        for (char ch: test.toCharArray()){
            out.write(ch);
        }

        /*for (int i = 0; i < test.length(); i++){
            out.write(test.charAt(i));
        }*/

    }
}
