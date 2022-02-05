package AdvancedPractice;

public class ObjectClass {
    public static void main(String[] args) {

        MyClass object1 = new MyClass ("abcdefg");
        MyClass object2 = new MyClass ("abcdefg");

        object1.MyMethod();
        object2.MyMethod();

        System.out.println("The objects are the same: " +(object1 == object2));  // compares if the objects are the same -> False
        System.out.println("The objects are the same: " + object1.equals(object2)); //


    }
}
