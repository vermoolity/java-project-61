package hexlet.code;

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
}
