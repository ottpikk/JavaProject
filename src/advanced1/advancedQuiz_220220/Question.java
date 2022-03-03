package advanced1.advancedQuiz_220220;

public class Question {

    //Fields
    public String text;        //For storing question
    public String[] answers;   //For storing answers
    public String rightAnswer; //For storing right answers

    //Methods
    public Question(String text, String... answers){
        this.text = text;
        this.answers = answers;
        this.rightAnswer = answers[0];

        for (int i = 0; i < answers.length; i++){
            int randomIndex = (int)(Math.random() * answers.length);
            String temp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex] = temp;
        }
    }

    public Question(){

    }

}
