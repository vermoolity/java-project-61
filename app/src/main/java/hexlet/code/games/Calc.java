package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.Random;
public class Calc {

    private static String[] calculatorExampleAndAnswer() {
        var random = new Random();

        String[] operators = {"-",  "+", "*"};

        //Сгенерируем случайный оператор.
        var operator = operators[random.nextInt(operators.length)];

        // Сгенерируем случайное первое число.
        int numberOne = RandomNumber.randomNumber();
        // Сгенерируем случайное второе число.
        int numberTwo = RandomNumber.randomNumber();
        String correctAnswer = null;

        if (operator.equals("-")) {
            correctAnswer = (numberOne - numberTwo) + "";
        } else if (operator.equals("+")) {
            correctAnswer = (numberOne + numberTwo) + "";
        } else if (operator.equals("*")) {
            correctAnswer = (numberOne * numberTwo) + "";
        }
        String example = numberOne + " " + operator + " " + numberTwo;
        //Возвращаем пример и правельный ответ.
        return new String[] {example, correctAnswer};

    }
    public static void calculator() {
        var question = "What is the result of the expression?";

        Engine.engine(question,
                calculatorExampleAndAnswer(),
                calculatorExampleAndAnswer(),
                calculatorExampleAndAnswer());
    }

}
