package Biblio;

import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        int x = 5;
        while (x < 10){
            System.out.println(x);
            x++;
        }

        Scanner scanner = new Scanner(System.in);

        String input;
        String all = "";

        do {
            input = scanner.nextLine();
            all += input +" ";
        } while (!input.equals("STOP"));

        System.out.println(all);
    }
}
