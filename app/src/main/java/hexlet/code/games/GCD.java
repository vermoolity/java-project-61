package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class GCD {
    // Метод узнает на какой наибольший общий делитель делятся передаваемые числа.
    private static String correctAnswerGCD(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int a = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = a;
        }
        return numberOne + "";
    }
    public static String[] gcdQuestionAndAnswer() {
        // Генерируем первое число.
        var numberOne = RandomNumber.randomEvenNumber();
        // Генерируем второе число.
        var numberTwo = RandomNumber.randomEvenNumber();

        // Создаем вопрос.
        String example = numberOne + " " + numberTwo;
        String correctAnswer = correctAnswerGCD(numberOne, numberTwo);
        // Возвращаем вопрос и верный ответ.
        return new String[] {example, correctAnswer};
    }

    public static void gcd() {

        var gameRules = "Find the greatest common divisor of given numbers.";

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();
        for (var i = 0; i != 3; i++) {
            questionsAndAnswers.add(gcdQuestionAndAnswer());
        }
        Engine.engine(gameRules, questionsAndAnswers);
    }
}
