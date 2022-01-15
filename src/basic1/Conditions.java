package basic1;

public class Conditions {

    public static void main(String[] args) {

        boolean birthday = false;

        if(birthday){
            System.out.println("Happy birthday");
        }

        int birthdayDate = 051221;
        int todaysDate = 051220;
        todaysDate++;

        if(birthdayDate == todaysDate ){
            System.out.println("Happy Birthday!");
        }

        float temp = 34.5f;
        if(temp > 36.7f) {
            System.out.println("Sick");
        } else if (temp < 36f){
            System.out.println("Sick");
        } else {
            System.out.println("all good");
        }

        if(temp < 36.4f) {
            System.out.println("Low temp");
        } else if(temp >= 36.4f && temp <=36.5f){
            System.out.println("ok temp");
        } else if(temp == 36.6 ){
            System.out.println("Normal temp");
        } else {
            System.out.println("high temp");
        }

        int age = 34;
        if(age <=2 ){
            System.out.println("baby");
        } else if(age >2 && age <=10){
            System.out.println("kid");
        } else if(age >10 && age <= 17){
            System.out.println("teen");
        } else if(age == 18){
            System.out.println("18");
        } else if(age < 0 || age > 120){
            System.out.println("Wrong input");
        } else{
            System.out.println("Adult");
        }





    }
}
