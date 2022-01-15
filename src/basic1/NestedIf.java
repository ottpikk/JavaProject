package basic1;

public class NestedIf {
    public static void main(String[] args) {
        int grade = 8;

        if(grade >= 4){
            System.out.println("Ok");
            if(grade <= 7){
                System.out.println("4-7");
            } else {
                System.out.println("7-10");
            }
        } else {
            System.out.println("Not Ok");
        }
    }


}
