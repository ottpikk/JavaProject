package BiblioAdvanced;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class CallPersonClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person john = new Person();
        john.firstName = "John";
        john.lastName = "Doe";
        john.birthday = new GregorianCalendar(1988,1,5);

        System.out.println("Hello my name is " +john.fullName());
        System.out.println("I am " +john.age(new GregorianCalendar())+ " years old");

    }
}
