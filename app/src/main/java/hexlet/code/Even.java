package hexlet.code;

import java.util.Scanner;

public class Even {

    private static boolean evenGame() {
        Scanner scanner = new Scanner(System.in);

        var number = (int) (Math.random() * 100) + 1;
        System.out.println("Question: " + number);

        String userAnswer = scanner.next();

        System.out.println("Your answer: " + number);

        boolean result = false;
        String correctAnswer = number % 2 == 0 ? "yes" : "no";

        if (userAnswer.equals(correctAnswer)) {
            result = true;
            System.out.println("Correct!");

        } else {
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                                + correctAnswer + "\'.");
        }
        return result;
    }


    public static void even() {
        String name = Greet.greeting();
        System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
        boolean result = false;
        for (var i = 0; i < 3; i++) {
            result = evenGame();
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
