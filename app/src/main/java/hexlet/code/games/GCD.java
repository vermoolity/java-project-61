package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

public class GCD {
    //Метод возвращает чётное случаенное число.
    private static int randomEvenNumber() {
        int evenNumber = 1;
        while (evenNumber % 2 != 0) {
            evenNumber = RandomNumber.randomNumber();
        }
        return Math.abs(evenNumber);
    }
    public static String[] gcdExampleAndAnswer() {
        var numberOne = randomEvenNumber();
        var numberTwo = randomEvenNumber();

        String example = numberOne + " " + numberTwo;
        //Узнаем на какое наибольшее число делятся данные числа.
        while (numberTwo != 0) {
            int a = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = a;
        }
        String correctAnswer = numberOne + "";

        //Возвращаем пример и верный ответ.
        return new String[] {example, correctAnswer};
    }

    public static void gcd() {

        var question = "Find the greatest common divisor of given numbers.";

        Engine.engine(question,
                gcdExampleAndAnswer(),
                gcdExampleAndAnswer(),
                gcdExampleAndAnswer());
    }
}
