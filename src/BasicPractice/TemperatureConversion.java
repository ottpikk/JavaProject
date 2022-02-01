package BasicPractice;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        // F to C   -   ((t-32) * 5) / 9
        // C to K   -   t + 273.15
        // K to F   -   (((t- 273.15) * 9) /5) +32

        Scanner scanner = new Scanner(System.in);

        char inputUnit ='C';
        char outputUnit ='C';
        char inputType;
        char outputType;
        float inputValue;
        float returnValue = 0;

        System.out.println("Choose your input type (F/C/K): ");
        inputType = scanner.next().charAt(0);
        System.out.println("Choose your output type (F/C/K): ");
        outputType = scanner.next().charAt(0);
        System.out.println("Please enter your temperature: ");
        inputValue = scanner.nextFloat();

        switch (inputType){
            case 'F','f':
                inputValue = fToC(inputValue);
                inputUnit = 'F';
                break;
            case 'C','c':
                inputUnit = 'C';
                break;
            case 'K','k':
                inputValue = kToC(inputValue);
                inputUnit = 'K';
            default:
                System.out.println("Invalid input, program quits!");
                System.exit(1);
        }
        switch (outputType){
            case 'F','f':
                returnValue = cTof(inputValue);
                outputUnit = 'F';
                break;
            case 'C','c':
                returnValue = inputValue;
                outputUnit = 'C';
                break;
            case 'K','k':
                returnValue = cTok(inputValue);
                outputUnit = 'K';
                break;
            default:
                System.out.println("Invalid input, program quits!");
                System.exit(1);
        }
        System.out.println(inputValue +""+ inputUnit +" equals to "+ returnValue +""+ outputUnit);


    }
    public static float fToC(float fVal){
        return ((fVal-32.0f) * 5.0f) / 9.0f;
    }
    public static float kToC (float kVal){
        return kVal - 273.15f;
    }
    public static float cTok (float cVal){
        return cVal + 273.15f;
    }
    public static float cTof (float cVal){
        return cVal * 1.8f + 32;
    }
}
