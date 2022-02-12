package basic2;

import java.util.Locale;

public class StringExample {

    public static void main(String[] args) {

        String name = "Bob ";
        String lastName = new String("Forrest");

        String fullName = name + lastName;
        System.out.println(fullName);

        String fullName2 = name.concat(lastName);
        System.out.println(fullName2);

        System.out.println(name.equals(lastName));  //false or true

        System.out.println(lastName.length());

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));

        System.out.println(lastName.toUpperCase().charAt(0));

        String text = "LiKe ThIs StUpId TrEnD ";
        System.out.println(text.toLowerCase());
        System.out.println(text.indexOf("St")); // starts on 10th index in text

        String textTest = "This car is sitt. Your shop is also sitt. This is river perse";
        System.out.println(textTest.replaceAll("sitt", "s**t").replaceAll("perse","p***e"));

        System.out.println(textTest.substring(5,7));




    }
}
