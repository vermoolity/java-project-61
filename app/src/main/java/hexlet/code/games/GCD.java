package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static int randomEvenNumber() {

        int evenNumber = 1;
        while (evenNumber % 2 != 0) {
            evenNumber = (int) (Math.random() * 100) + 1;
        }
        return Math.abs(evenNumber);
    }
    public static boolean gcd() {
        var numberOne = randomEvenNumber();
        var numberTwo = randomEvenNumber();

        System.out.println("Question: " + numberOne + " " + numberTwo);

        while (numberTwo != 0) {
            int a = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = a;
        }
        String correctAnswer = numberOne + "";
        // Возвращаем правельный ответ.
        return Engine.answerUser(correctAnswer);
    }
}