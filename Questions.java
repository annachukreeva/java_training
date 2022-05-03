package com.classes.homework;

public class Questions {
    private String[] questions = new String[3];
    public Questions() {
        questions[0] = "File of what type java file is being compiled?";
        questions[1] = "What command should be used for receiving a full copy of repository?";
        questions[2] = "What cycle is being used when one do not know number of iterations?";
    }

    public void GetQuestions(int i) {
            System.out.println(questions[i]);
    }
}


