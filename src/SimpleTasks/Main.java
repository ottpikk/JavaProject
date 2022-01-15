package SimpleTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String inputString = scanner.nextLine();
        ReverseString someWord = new ReverseString();
        someWord.setInputString(inputString);
        System.out.println(someWord.getReverseString());




    }
}
