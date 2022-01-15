package basic1;

public class DataTypes {

    public static void main(String[] args) {

        System.out.println("Hello World");

        byte num1 = 5;
        short num2 = 32000;
        int num3 = 4256354;
        long num4 = 454565464L;

        System.out.println("I have " + num1 + " cars");

        float temp = 22.5f;
        double temp1 = 3.145848451D;

        boolean lightSwitch = true;
        lightSwitch = false;

        System.out.println(lightSwitch);

        char letter = 'd';
        char symbol = '#';
        char tab = '\t';
        char newLine = '\n';

        System.out.println(letter +""+ tab +""+ symbol +""+ newLine +""+ letter);

        String text = "Random text";
        System.out.println(text);
    }
}
