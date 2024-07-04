package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class Prime {
    private static String[] primeQuestionAndAnswer(int number) {
        // Mетод проверяет переданное число простое или нет.
        String correctAnswer = "yes";
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
            }
        }
        String example = number + "";
        return new String[] {example, correctAnswer};
    }

    public static void prime() {

        var gameRules = "Answer \'yes\' if given number is prime. Otherwise answer \'no\'.";

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();
        for (var i = 0; i != 3; i++) {
            questionsAndAnswers.add(primeQuestionAndAnswer(RandomNumber.randomNumber()));
        }
        Engine.engine(gameRules, questionsAndAnswers);

    }
}
