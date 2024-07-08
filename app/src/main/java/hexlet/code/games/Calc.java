package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;
import java.util.Random;
public class Calc {
    public static String[] calcCreatingAnExampleAndAnswer(String operator, int numberOne, int numberTwo) {
        // Определяем переданный оператор, и создаем пример.
        String correctAnswer = null;

        if (operator.equals("-")) {
            correctAnswer = (numberOne - numberTwo) + "";
        } else if (operator.equals("+")) {
            correctAnswer = (numberOne + numberTwo) + "";
        } else if (operator.equals("*")) {
            correctAnswer = (numberOne * numberTwo) + "";
        }
        String example = numberOne + " " + operator + " " + numberTwo;

        return new String[] {example, correctAnswer};
    }

    private static String[] calcQuestionAndAnswer(int maxNumber) {
        var random = new Random();

        String[] operators = {"-",  "+", "*"};

        //Сгенерируем случайный оператор.
        var operator = operators[random.nextInt(operators.length)];

        // Сгенерируем случайное первое число.
        int numberOne = RandomNumber.naturalOrNegativeRandomNumber(maxNumber);
        // Сгенерируем случайное второе число.
        int numberTwo = RandomNumber.naturalOrNegativeRandomNumber(maxNumber);

        return calcCreatingAnExampleAndAnswer(operator, numberOne, numberTwo);
    }
    public static void calculator(int maxNumber) {

        var gameRules = "What is the result of the expression?";

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(calcQuestionAndAnswer(maxNumber));
        }

        Engine.engine(gameRules, questionsAndAnswers);

    }
}
