package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Calc {

    private static String[] creatingAnExample() {
        var random = new Random();

        String[] operators = {"-",  "+", "*"};

        //Сгенерируем случайный оператор.
        var operator = operators[random.nextInt(operators.length)];

        // Сгенерируем случайное первое число.
        int numberOne = (int) (Math.random() * 101) + 1;
        // Сгенерируем случайное второе число.
        int numberTwo = (int) (Math.random() * 101) + 1;
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
    /*
    Метод вызывает движок и передает в него значение, такие как:
    Строку которую нужно вывести
    Пример
    Правельный ответ на вопрос
    */
    public static void calculator() {

        String[] firstExampleAndAnswer = creatingAnExample();
        String firstExample = firstExampleAndAnswer[0];
        String firstCorrectNumber = firstExampleAndAnswer[1];

        String[] secondExampleAndAnswer = creatingAnExample();
        String secondExample = secondExampleAndAnswer[0];
        String secondCorrectNumber = secondExampleAndAnswer[1];

        String[] thirdExampleAndAnswer = creatingAnExample();
        String thirdExample = thirdExampleAndAnswer[0];
        String thirdCorrectNumber = thirdExampleAndAnswer[1];

        var question = "What is the result of the expression?";

        Engine.engine(question, firstExample, firstCorrectNumber, secondExample, secondCorrectNumber,
                thirdExample, thirdCorrectNumber);
    }

}
