package com.classes.homework;

import java.util.Scanner;

public class Answers
{
    private String[][] answers = new String[3][4];

    public Answers()
    {
        answers[0][0] = "1.cs";
        answers[0][1] = "2.java";
        answers[0][2] = "3.class";
        answers[0][3] = "4.exe";

        answers[1][0] = "1.commit";
        answers[1][1] = "2.push";
        answers[1][2] = "3.clone";

        answers[2][0] = "1.while";
        answers[2][1] = "2.for";
        answers[2][2] = "3.loop";
    }

   public void GetAnswers(int i)
   {
        for (int j = 0; j < 4; j++)
        {
            if (answers[i][j]!=null)
            System.out.println(answers[i][j]);
        }
   }
}





