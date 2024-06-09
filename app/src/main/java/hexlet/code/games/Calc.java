package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static boolean calculator() {
        String[] operators = {"-",  "+", "*"};
        String correctAnswer = null;
        var random = new Random();
        var operator = operators[random.nextInt(operators.length)];
        int numberOne = random.nextInt() % 100;
        int numberTwo = random.nextInt() % 100;

        if (operator.equals("-")) {
            correctAnswer = (numberOne - numberTwo) + "";
        } else if (operator.equals("+")) {
            correctAnswer = (numberOne + numberTwo) + "";
        } else if (operator.equals("*")) {
            correctAnswer = (numberOne * numberTwo) + "";
        }

        System.out.println("Question: " + numberOne + " " + operator + " " + numberTwo);
        return Engine.answerUser(correctAnswer);
    }
    public static void calc() {
        String name = Greet.greeting();
        System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
        boolean result = false;
        for (var i = 0; i < 3; i++) {
            result = calculator();
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
