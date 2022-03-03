package advanced1.cT220220.buffering;

import java.io.*;;

public class DataBuffering {
    public static void main(String[] args) throws IOException {

        //Option 1
        FileReader fileReader = new FileReader("Data\\Input.txt");
        BufferedReader in2 = new BufferedReader(fileReader);

        //Option 2
        BufferedReader in = new BufferedReader(new FileReader("Data\\Input.txt"));

        String line;
        while ((line = in.readLine()) != null){
            System.out.println("Line:" + line);
        }

        //Write
        BufferedWriter out = new BufferedWriter(new FileWriter("Data\\Output2.txt",true));

        //Write string lines to file
        String data = "This is data: \n2.\tline\n3.\tline\n(DataBuffering)";
        out.write(data);
        out.close();

    }
}
