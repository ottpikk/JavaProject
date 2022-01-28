package Biblio;

public class StringClass {
    public static void main(String[] args) {

        String s1 = new String("Strings are arrays of characters");
        String s2 = new String("Strings are arrays of characters");
        System.out.println("string1: " + s1);
        System.out.println("string2: " + s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("string1: " + s1.replace("characters", "char"));
        System.out.println("string2: " + s2);
        System.out.println(s1.equals(s2));
        System.out.println();

        CustomPrinter printer = new CustomPrinter("> > &s < <");
        String a1 = new String("Strings are arrays of characters");
        String a2 = new String("Strings are arrays of characters");
        printer.println("string1: " + a1.replace("characters", "char"));
        printer.println("string2: " + a2);





    }
}
