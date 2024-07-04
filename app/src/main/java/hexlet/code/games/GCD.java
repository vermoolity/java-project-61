package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;

public class GCD {
    //Метод возвращает чётное случаенное число. в рандом
    private static String correctAnswerGCD(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int a = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = a;
        }
        return numberOne + "";
    }
    public static String[] gcdQuestionAndAnswer() {
        var numberOne = RandomNumber.randomEvenNumber();
        var numberTwo = RandomNumber.randomEvenNumber();

        String example = numberOne + " " + numberTwo;
        String correctAnswer = correctAnswerGCD(numberOne, numberTwo);
        //Возвращаем пример и верный ответ.
        return new String[] {example, correctAnswer};
    }

    public static void gcd() {

        var gameRules = "Find the greatest common divisor of given numbers.";

        var numberOfRounds = 3;
        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();
        for (var i = 0; i != numberOfRounds; i++) {
            questionsAndAnswers.add(gcdQuestionAndAnswer());
        }
        Engine.engine(gameRules, questionsAndAnswers);
    }
}
