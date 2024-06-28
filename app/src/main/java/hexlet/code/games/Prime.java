package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

public class Prime {

    private static String[] primeExampleAndAnswer() {
        int number = RandomNumber.randomNumber();
        String correctAnswer = "yes";
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
            }
        }
        String example = number + "";
        //Возвращает ответ.
        return new String[] {example, correctAnswer};
    }
    public static void prime() {

        var question = "Answer \'yes\' if given number is prime. Otherwise answer \'no\'.";

        Engine.engine(question,
                primeExampleAndAnswer(),
                primeExampleAndAnswer(),
                primeExampleAndAnswer());
    }
}