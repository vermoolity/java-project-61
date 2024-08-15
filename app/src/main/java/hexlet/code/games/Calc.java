package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;
import hexlet.code.RandomOperator;

import java.util.ArrayList;
public class Calc {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String GAME_RULES = "What is the result of the expression?";
    // Определяем переданный оператор, и создаем пример.

    private static int correctAnswerCalc(String operator, int numberOne, int numberTwo) throws Exception {
        int correctAnswer = 0;

        if (operator.equals("-")) {
            correctAnswer = (numberOne - numberTwo);

        } else if (operator.equals("+")) {
            correctAnswer = (numberOne + numberTwo);

        } else if (operator.equals("*")) {
            correctAnswer = (numberOne * numberTwo);

        } else {
            throw new Exception("the operator passed does not match");
        }

        return correctAnswer;
    }
    // создаём пример в виде строки.
    public static String creatingAnExample(String operator, int numberOne, int numberTwo) {
        return numberOne + " " + operator + " " + numberTwo;
    }
    public static String[] calcCreatingAnExampleAndAnswer(String operator, int numberOne, int numberTwo) throws Exception {
        String correctAnswer = correctAnswerCalc(operator, numberOne, numberTwo) + "";
        String example = creatingAnExample(operator, numberOne, numberTwo);
        return new String[] {example, correctAnswer};
    }

    private static String[] calcQuestionAndAnswer() throws Exception {
        // Сгенирируем случайный оператор
        String operator = RandomOperator.randomOperator();
        // Сгенерируем случайное первое число.
        int numberOne = RandomNumber.naturalOrNegativeRandomNumber(MAX_RANDOM_NUMBER);
        // Сгенерируем случайное второе число.
        int numberTwo = RandomNumber.naturalOrNegativeRandomNumber(MAX_RANDOM_NUMBER);

        return calcCreatingAnExampleAndAnswer(operator, numberOne, numberTwo);
    }
    public static void calculator() throws Exception {

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(calcQuestionAndAnswer());
        }

        Engine.engine(GAME_RULES, questionsAndAnswers);
    }
}
