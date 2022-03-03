package advanced1.advancedQuizGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class QuestionAnswers {
    private String data;
    protected String question;
    public String[] answers;
    protected String rightAnswer;

    Scanner scanner = new Scanner(System.in);

    List<String> lines = Files.readAllLines(Paths.get(data));



    int numOfAnswers = Integer.valueOf(lines.get(0));

    public QuestionAnswers() throws IOException {

    }
    public String filePath(int dataNo) {
        switch (dataNo){
            case 1:
                this.data = "Data\\Quiz\\data1.txt";
                break;
            case 2:
                this.data = "Data\\Quiz\\data2.txt";
                break;
            case 3:
                this.data = "Data\\Quiz\\data3.txt";
                break;
            default:
                this.data = "Data\\Quiz\\topic.txt";
                break;
        }

        return data;


    }
    public String getQuestion(int questionsNumber) {
        this.question = lines.get(questionsNumber*(numOfAnswers+1)-numOfAnswers);
        return question;
    }
    public String[] getAnswers() {
        answers = new String[numOfAnswers];
        for (int i = 1; i <= numOfAnswers; i++ ){
            answers[i-1] = lines.get(lines.indexOf(question)+i);
        }
        for (int i = 0; i < numOfAnswers; i++){
            int randomIndex = (int)(Math.random() * numOfAnswers);
            String temp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex] = temp;
        }
        this.answers = answers;
        return answers;
    }
    public String getRightAnswer() {
        this.rightAnswer = lines.get(lines.indexOf(question)+1);
        return rightAnswer;
    }
    public int numberOfQuestions(){
        return lines.size()/(numOfAnswers+1);
    }

}
