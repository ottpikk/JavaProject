package advanced1.ct220219;

public class ExceptionExample {
    public static void main(String[] args) {


        int index = 4;

        try {
            int num1 = 5 / 0;
            System.out.println(num1);
            int[] num = {1,2,3,4};
            System.out.println(num[index]);

        } catch (ArithmeticException e){
            System.out.println("Arithmetical problems");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array problems");
        } catch (Exception e){
            System.out.println("Something else");
        }
        finally {
            System.out.println("In the finally block"); //here code, must be run either way exception or not
        }




    }

}
