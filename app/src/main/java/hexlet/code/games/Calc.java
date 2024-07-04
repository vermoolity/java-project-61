package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;
import java.util.Random;
public class Calc {
    public static String[] calcCreatinganExampleAndAnswer(String operator, int numberOne, int numberTwo) {
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

    private static String[] calcQuestionAndAnswer() {
        var random = new Random();

        String[] operators = {"-",  "+", "*"};

        //Сгенерируем случайный оператор.
        var operator = operators[random.nextInt(operators.length)];

        // Сгенерируем случайное первое число.
        int numberOne = RandomNumber.naturalOrNegativeRandomNumber();
        // Сгенерируем случайное второе число.
        int numberTwo = RandomNumber.naturalOrNegativeRandomNumber();

        return calcCreatinganExampleAndAnswer(operator, numberOne, numberTwo);
    }
    public static void calculator() {
        var gameRules = "What is the result of the expression?";
        var numberOfRounds = 3;
        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();
        for (var i = 0; i != numberOfRounds; i++) {
            questionsAndAnswers.add(calcQuestionAndAnswer());
        }
        Engine.engine(gameRules, questionsAndAnswers);

    }
}
