package advanced1.advancedQuizGame;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static QuestionAnswers question;


    public static void main(String[] args) {

        init();
        gameMenu();
    }

    private static void init() {
        try {

            question = new QuestionAnswers();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }
    }

    private static void loop() {
        int questionNumber = 1, score = 0;

        //Game Loop
        while (questionNumber <= question.numberOfQuestions()) {

            //Print question
            System.out.println(question.getQuestion(questionNumber));

            //Print answers
            question.getAnswers();
            for (int i = 0; i < question.numOfAnswers; i++) {
                System.out.println("\t" + i + 1 + ".) " + question.answers[i]);
            }
            //Get user input
            int answer = scanner.nextInt();

            // Validate user input
            if (answer < 0 || answer > question.answers.length) {
                System.out.println("Input is invalid");
                System.exit(-2);
            }
            //Compare user input with correct answer
            if ((question.answers[answer - 1]).equals(question.getRightAnswer())) {
                System.out.println("Correct answer!\n");
                score++;
            } else {
                System.out.println("You got wrong, correct is " + question.getRightAnswer());
            }
            questionNumber++;
        }
        //Print result
        System.out.println("You got " + score + " answers right");


    }

    private static void gameMenu() {
        System.out.println("\tMake your Choice:" +
                "\n\t\t1.) PLAY QUIZ" +
                "\n\t\t2.) ADD QUESTIONS");
        int menu = scanner.nextInt();
        scanner.nextLine();
        if (menu == 1 || menu == 2){
            System.out.println("\tChoose your topic:");
            for (int i = 1; i < question.lines.size(); i++){
                System.out.println( "\t\t" +i+". " + question.lines.get(i));
            }
            int topic = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1){
                question.filePath(topic);
                loop();
            } else if (menu == 2){
                System.out.println("Here is input !!!");
            }
        } else {
            System.out.println("Input is invalid");
            System.exit(-3);
        }



        // Methods
        // 1 Choose quiz topic
        // 2 Choose to add question
    }
}