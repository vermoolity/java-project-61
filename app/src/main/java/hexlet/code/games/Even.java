package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String GAME_RULES = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";
    // Метод генерирует случайное число и определяет чётное ли число.
    private static String[] evenQuestionAndAnswer() {
        String number = RandomNumber.randomNumber(MAX_RANDOM_NUMBER) + "";
        String correctAnswer = Integer.parseInt(number) % 2 == 0 ? "yes" : "no";

        return new String[] {number, correctAnswer};
    }
    public static void even() {

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(evenQuestionAndAnswer());
        }

        Engine.engine(GAME_RULES, questionsAndAnswers);
    }
}
