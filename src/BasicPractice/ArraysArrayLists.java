package BasicPractice;

import java.util.Scanner;

public class ArraysArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introduction to Arrays
        /*char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = (char)(97 + i);
        }
        System.out.println(Arrays.toString(alphabet));

        int[] intArray = new int[25];
        for (int i = 1; i < intArray.length; i++){
            intArray[0] = 0;
            intArray[i] = intArray[i - 1] + 1;
        }
        System.out.println(Arrays.toString(intArray));

        char[] charArray = new char[36];
        for (int i =0; i < charArray.length; i++){
            charArray[i] = (char)(1 + i);
        }
        System.out.println(Arrays.toString(charArray));*/

        // ChessBoard Array
        /*int boardDimensions = 8;
        char[][] chessBoard = new char[boardDimensions][boardDimensions];
        boolean isWhite = false;
        for (int i = 0; i < chessBoard.length; i++){
            isWhite = !isWhite;
            for (int j = 0; j < chessBoard[i].length; j++){
                if (isWhite) chessBoard[i][j] = 'W';
                if (!isWhite) chessBoard[i][j] = 'B';
                isWhite = !isWhite;
            }
        }
        for (int i = 0; i < chessBoard.length; i++){
            System.out.println(Arrays.toString(chessBoard[i]));
        }*/

        //ArrayList
        /*ArrayList<String> memory = new ArrayList<String>();
        while (true){
            memory.add(scanner.nextLine());
            if ((memory.get(memory.size()-1)).equals("CLEAR")) { //ask for AL size, if last inserted element equals to CLEAR
                memory.clear();                     //Empty the AL of all elements
            }else if ((memory.get(memory.size() - 1)).equals("END")){
                break;                              // if last element END, break the input
            }
            System.out.println(memory.toString()); //Prints out whole ArrayList
        }*/







    }
}
