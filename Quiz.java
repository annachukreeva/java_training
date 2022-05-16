package homework;

public class Quiz {
    public static void main(String[] args) {
        Answer answer1 = new Answer("1.cs");
        Answer answer2 = new Answer("2.java");
        Answer answer3 = new Answer("3.class");
        Answer answer4 = new Answer("4.exe");
        Answer answer5 = new Answer("1.commit");
        Answer answer6 = new Answer("2.push");
        Answer answer7 = new Answer("3.clone");
        Answer answer8 = new Answer("4.copy");
        Answer answer9 = new Answer("1.while");
        Answer answer10 = new Answer("2.for");
        Answer answer11 = new Answer("3.loop");
        Question question1 = new Question ("File of what type java file is being compiled?", new Answer[] {answer1, answer2, answer3, answer4}, 3);
        Question question2 = new Question ("What command should be used for receiving a full copy of repository?", new Answer[] {answer5, answer6, answer7, answer8}, 3);
        Question question3 = new Question ("What cycle is being used when one do not know number of iterations?", new Answer[] {answer9, answer10, answer11}, 1);
        Test test = new Test (new Question[] {question1, question2, question3});
        test.checkTest();
    }
};
