package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;

public class GCD {
    private static int randomEvenNumber() {
        int evenNumber = 1;
        while (evenNumber % 2 !=0) {
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
        return Engine.answerUser(correctAnswer);
    }
    public static void startGcd() {
        String name = Greet.greeting();
        System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
        boolean result = false;
        for (var i = 0; i < 3; i++) {
            result = gcd();
            if (result) {
                continue;
            } else {
                break;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
