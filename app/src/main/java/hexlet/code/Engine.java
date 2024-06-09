package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static boolean answerUser(String correctAnswer) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);

        boolean result = false;

        if (userAnswer.equals(correctAnswer)) {
            result = true;
            System.out.println("Correct!");

        } else {
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + correctAnswer + "\'.");
        }
        return result;
    }
    public static void startGame(String choice) {
        String name = Greet.greeting();
        boolean result = false;
        for (var i = 0; i < 3; i++) {
            switch (choice) {
                case "2":
                    System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
                    result = Even.even();
                    break;
                case "3":
                    System.out.println("What is the result of the expression?");
                    result = Calc.calculator();
                    break;
                case "4":
                    System.out.println("Find the greatest common divisor of given numbers.");
                    result = GCD.gcd();
                    break;
                case "5":
                    System.out.println("What number is missing in the progression?");
                    result = Progression.progression();
                    break;
                default:
                    break;
            }
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
