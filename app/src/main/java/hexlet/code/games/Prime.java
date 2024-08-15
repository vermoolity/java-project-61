package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String GAME_RULES = "Answer \'yes\' if given number is prime. Otherwise answer \'no\'.";

    // Mетод проверяет переданное число простое оно или нет.
    private static boolean isPrime(int number) {
        boolean flag = true;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                flag = false;
            }
        }

        return flag;
    }
    private static String[] primeQuestionAndAnswer(int number) {
        String correctAnswer = isPrime(number) ? "yes" : "no";

        String example = number + "";

        return new String[] {example, correctAnswer};
    }

    public static void prime() {

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(primeQuestionAndAnswer(RandomNumber.randomNumber(MAX_RANDOM_NUMBER)));
        }

        Engine.engine(GAME_RULES, questionsAndAnswers);
    }
}
