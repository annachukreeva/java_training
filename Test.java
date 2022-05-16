package homework;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Test {
    private Question[] questions;
    private int rightAnswerCount;
    private int wrongAnswerCount;


    public Test(Question[] questions) {
        this.questions = questions;
    }

    public void checkTest() {
        for (int i=0; i<questions.length; i++){
            boolean ask = questions[i].ask();

            if(ask) {
                System.out.println("Верно");
                rightAnswerCount++;
            }
            else {
                System.out.println("Неверно");
                wrongAnswerCount++;
            }
        }
        System.out.println("Результат: правильно " + rightAnswerCount + ", неправильно " + wrongAnswerCount);

    }

};
