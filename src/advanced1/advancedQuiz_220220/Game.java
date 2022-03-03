package advanced1.advancedQuiz_220220;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Error -1 - reader could not find right file
* Error -2 - wrong user input
* Error -3
* Error -4 - player exited correctly
* Error -5 - adding question was failed (file not found)
*/

public class Game {
    private static ArrayList<Question> questions = new ArrayList<Question>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Let player choose the topic
        int topic = 1;
        while (topic != 4){
            System.out.println("Choose your topic:" +
                    "\n\t1.)\tCapitals" +
                    "\n\t2.)\tGeography" +
                    "\n\t3.)\tAnimals" +
                    "\n\t4.)\tExit");
            topic = scanner.nextInt();
            scanner.nextLine();
            init(topic);
            //Ask if player wants to play or add questions
            System.out.println("Do you want to play or add questions? (p/a)");
            String choice = scanner.nextLine();
            if (choice.equals("p")){
                init(topic);
                loop();
            } else if (choice.equals("a")){
                init(topic);
                write(topic);
            } else {
                System.exit(-4);
            }
        }
    }
    //Initialize game
    private static void init(int topic){
        //Init the right file
        String path = "";
        switch (topic){
            case 1: path = "Data\\Quiz\\data1.txt";
                break;
            case 2: path = "Data\\Quiz\\data2.txt";
                break;
            case 3: path = "Data\\Quiz\\data3.txt";
                break;
            case 4:
                System.out.println("See you!!");
                System.exit(-3);
        }
        try {

            List<String> lines = Files.readAllLines(Paths.get(path));
            int numOfAnswers = Integer.valueOf(lines.get(0));
            for (int i = 1; i < lines.size(); i += (numOfAnswers+1)){
                Question q;
                if (lines.get(i+3).equals(lines.get(i+numOfAnswers))){
                    q = new Question(lines.get(i), lines.get(i+1), lines.get(i+2), lines.get(i+3));
                } else {
                    q = new Question(lines.get(i), lines.get(i+1), lines.get(i+2), lines.get(i+3), lines.get(i+4));
                }
                questions.add(q);
            }
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }
    }
    //Game play loop
    private static void loop(){
        int score = 0;

        while(questions.size() > 0){
            Question currentQuestion = questions.remove(0);

            //Printing question
            System.out.println(currentQuestion.text);

            //Printing all answers
            for (int i = 0; i < currentQuestion.answers.length; i++){
                System.out.println("\t" + (i+1) + ")" + currentQuestion.answers[i]);
            }

            //Asking question
            System.out.println("Answer :");
            int input = scanner.nextInt();

            //Validating input from user
            if (input < 0 || input > currentQuestion.answers.length){
                System.out.println("Input is invalid");
                System.exit(-2);
            }
            //Checking if answer is right
            if (currentQuestion.rightAnswer.equals(currentQuestion.answers[input-1])){
                System.out.println("Right!");
                score ++;
            } else {
                System.out.println("Wrong");
            }
        }
        System.out.println("You got " + score + " questions right");
    }
    //Add question
    private static void write(int topic){
        try {
            //choose right file
            String path = "";
            switch (topic){
                case 1: path = "Data\\Quiz\\data1.txt";
                    break;
                case 2: path = "Data\\Quiz\\data2.txt";
                    break;
                case 3: path = "Data\\Quiz\\data3.txt";
                    break;
            }
            BufferedWriter out = new BufferedWriter(new FileWriter(path,true));

            //Ask question
            System.out.println("Write your question:");
            String question = "\n" + scanner.nextLine();
            out.write(question);

            //Ask right question
            System.out.println("Write the right answer:");
            String rightAnswer = "\n" + scanner.nextLine();
            out.write(rightAnswer);

            //Ask for some additional answers
            List<String> lines = Files.readAllLines(Paths.get(path));
            int numOfAnswers = Integer.valueOf(lines.get(0));
            System.out.println("Add " + (numOfAnswers -1) + " wrong answers");
            for (int i = 1; i < numOfAnswers; i++){
                System.out.println(i+ ". answer: ");
                String answer = "\n" + scanner.nextLine();
                out.write(answer);
            }
            System.out.println("Your question is added");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-5);

        }

    }
}
