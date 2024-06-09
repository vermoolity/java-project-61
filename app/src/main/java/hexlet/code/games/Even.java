package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static boolean even() {

        var number = (int) (Math.random() * 100) + 1;
        System.out.println("Question: " + number);
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        return Engine.answerUser(correctAnswer);
    }
}
