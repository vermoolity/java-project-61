package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class GCD {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";
    // Метод узнает на какой наибольший общий делитель делятся передаваемые числа.
    private static int correctAnswerGCD(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int a = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = a;
        }
        return numberOne;
    }
    public static String[] gcdQuestionAndAnswer() {
        // Генерируем первое число.
        var numberOne = RandomNumber.randomEvenNumber(MAX_RANDOM_NUMBER);
        // Генерируем второе число.
        var numberTwo = RandomNumber.randomEvenNumber(MAX_RANDOM_NUMBER);

        // Создаем вопрос.
        String example = numberOne + " " + numberTwo;
        String correctAnswer = correctAnswerGCD(numberOne, numberTwo) + "";

        // Возвращаем вопрос и верный ответ.
        return new String[] {example, correctAnswer};
    }

    public static void gcd() {

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(gcdQuestionAndAnswer());
        }
        Engine.engine(GAME_RULES, questionsAndAnswers);
    }
}
