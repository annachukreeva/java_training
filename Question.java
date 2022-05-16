package homework;
import java.util.Scanner;

public class Question {
    private String question;
    private Answer[] answers;
    private int rightAnswerIndex;

    public Question(String question, Answer[] answers, int rightAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public boolean ask(){
        System.out.println(question);
        for (int i=0; i <answers.length; i++){
            System.out.println(answers[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Ваш ответ:");
        int answer = input.nextInt();

        return answer ==rightAnswerIndex;

    }
};
