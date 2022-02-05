package AdvancedPractice;

public class ThePrimitiveClass {
    public static void main(String[] args) {

        String someString = "string";

        Character someCharacter = 'c';
        //  someCharacter.compareTo();  //compares 2 characters, returns 0 if equal
        System.out.println(Character.isLowerCase(someCharacter));  //checks if char is lowerCase (Unicode)
    }
}
