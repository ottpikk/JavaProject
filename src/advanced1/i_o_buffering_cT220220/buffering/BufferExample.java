package advanced1.i_o_buffering_cT220220.buffering;

import java.io.*;
import java.util.Scanner;

public class BufferExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Please enter full path for file you want to read:");
        String filepath = scanner.nextLine();
        System.out.println("What you want to enter?");
        String input = scanner.nextLine();

        writeFile(filepath,input);

        readFile(filepath);




    }

    private static void readFile(String filePath){
        String strBuffer;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            while ((strBuffer = bufferedReader.readLine()) != null){
                System.out.println(strBuffer);
            }

        } catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }


    private static void writeFile(String filePath, String strData){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))){

            bufferedWriter.write(strData);

        } catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
