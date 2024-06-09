package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static boolean calculator() {

        String[] operators = {"-",  "+", "*"};
        String correctAnswer = null;
        var random = new Random();
        var operator = operators[random.nextInt(operators.length)];
        // Сгенерируем случайное числа.
        int numberOne = random.nextInt() % 100;
        int numberTwo = random.nextInt() % 100;
        // определяем случайнный оператор.
        if (operator.equals("-")) {
            correctAnswer = (numberOne - numberTwo) + "";
        } else if (operator.equals("+")) {
            correctAnswer = (numberOne + numberTwo) + "";
        } else if (operator.equals("*")) {
            correctAnswer = (numberOne * numberTwo) + "";
        }

        System.out.println("Question: " + numberOne + " " + operator + " " + numberTwo);
        // Возвращаем правельный ответ.
        return Engine.answerUser(correctAnswer);
    }

}
