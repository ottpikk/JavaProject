package Advanced2.homeWork5Classes;

import Advanced2.homeWork5Classes.data.Competitor;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String name = "John";
        Competitor first;
        first= new Competitor();

        first.setCompetitor(name);

        first = new Competitor(name);








       // System.out.println(competitor.getName(0));


        /*for(int i = 0; i < 4; i++){
            System.out.println(competitor.getName(i));
        }*/


        /*String test = "esr";


        WriteToFile path = new WriteToFile();
        System.out.println("Choose the contest of your competitor: " +
                "\n\t1.\t110m hurdles" +
                "\n\t2.\tLong jump" +
                "\n\t3.\tDiscus" +
                "\n\t4.\tMarathon");
        int user = scanner.nextInt();
        String status = "finished successfully";
        try {
            FileOutputStream out = new FileOutputStream(path.getPath(user),true);
            for (char ch: test.toCharArray()){
                out.write(ch);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            status = "failed";
        } catch (IOException e){
            System.out.println(e.getMessage());
            status = "failed";
        } finally {
            System.out.println("Adding competitor "+status + " !!!");
        }*/

    }
}
