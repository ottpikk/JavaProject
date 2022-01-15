package basic2;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[][] names = new String[2][5];
        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("Element with index "+i+","+j+" is "+names[i][j]);
            }
        }

        String[][] myArray = new String[2][5];
        myArray[0][0] = "Audi";
        myArray[0][1] = "Opel";
        myArray[0][2] = "Volkswagen";
        myArray[0][3] = "Ford";
        myArray[0][4] = "Toyota";

        myArray[1][0] = "Lada";
        myArray[1][1] = "Ziguli";
        myArray[1][2] = "Moskvich";
        myArray[1][3] = "UAZ";
        myArray[1][4] = "Zaparožets??";

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                System.out.print(myArray[i][j]+", ");
            }
        }


    }
}
