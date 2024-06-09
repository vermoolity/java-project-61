package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;

public class Even {

    public static boolean evenGame() {

        var number = (int) (Math.random() * 100) + 1;
        System.out.println("Question: " + number);
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        return Engine.answerUser(correctAnswer);
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
