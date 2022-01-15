package basic1;

public class IfExamples {
    public static void main(String[] args) {


        //low temp < 36.4
        //normal temp 36.4 - 36.8
        //high temp > 36.8
        float temp = 36.6f;

        if (temp > 36.8 || temp < 36.4) {
            System.out.println("Sick");
        } else {
            System.out.println("Healthy");
        }

        if(temp > 36.8){
            System.out.println("Sick, temperature too high");
        } else if(temp < 36.4) {
            System.out.println("Sick, temperature too low");
        } else {
            System.out.println("You are healthy!");
        }

        if(temp >= 36.4 && temp <= 36.8){
            System.out.println("You are healthy!");
        } else {
            System.out.println("Sick!");
        }
    }
}
