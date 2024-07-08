package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class Even {
    // Метод генерирует случайное число и определяет чётное ли число.
    private static String[] evenQuestionAndAnswer(int maxNumber) {
        String number = RandomNumber.randomNumber(maxNumber) + "";
        String correctAnswer = Integer.parseInt(number) % 2 == 0 ? "yes" : "no";

        return new String[] {number, correctAnswer};
    }
    public static void even(int maxNumber) {

        var gameRules = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(evenQuestionAndAnswer(maxNumber));
        }

        Engine.engine(gameRules, questionsAndAnswers);
    }
}
