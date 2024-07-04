package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class Even {

    //Метод возвращает
    private static String[] evenQuestionAndAnswer() {
        String number = RandomNumber.randomNumber() + "";
        String correctAnswer = Integer.parseInt(number) % 2 == 0 ? "yes" : "no";
        return new String[] {number, correctAnswer};
    }
    public static void even() {

        var gameRules = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";

        var numberOfRounds = 3;
        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();
        for (var i = 0; i != numberOfRounds; i++) {
            questionsAndAnswers.add(evenQuestionAndAnswer());
        }
        Engine.engine(gameRules, questionsAndAnswers);
    }
}
