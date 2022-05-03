package com.classes.homework;
import java.util.Scanner;

public class CorrectAnswers {
    int[] correctAnswers= new int [3];
    int correctCount = 0;
    int wrongCount = 0;

    public CorrectAnswers(){
        correctAnswers[0] = 3;
        correctAnswers[1] = 3;
        correctAnswers[2] = 1;

    }
    public void receiveAnswer(int i)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ваш ответ:");
        int answer = input.nextInt();
        if (answer == correctAnswers [i]) {
            System.out.println("Верно");
            correctCount++;
        }else{
            System.out.println("Неверно");
            wrongCount++;
        }
    }
    public void getTotalResult (){
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

