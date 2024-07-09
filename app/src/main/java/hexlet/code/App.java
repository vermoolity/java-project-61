package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Выводим список игр.
        System.out.println("Please enter the game number and press Enter.");
        String[] startingLines = {"1 - Greet", "2 - Even", "3 - Calc",
            "4 - GCD", "5 - Progression", "6 - Prime"};
        for (var line : startingLines) {
            System.out.println(line);
        }
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        //Пользователь делает свой выбор.
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        System.out.println("");
        var maxRandomNumber = 100;
        var maxStepNumber = 10;
        var maxSizeProgression = 10;
        var minSizeProgression = 6;
        //Запуск игры.
        switch (choice) {
            case "1":
                Engine.greetingsAndQuestion();
                break;
            case "2":
                Even.even(maxRandomNumber);
                break;
            case "3":
                Calc.calculator(maxRandomNumber);
                break;
            case "4":
                GCD.gcd(maxRandomNumber);
                break;
            case "5":
                Progression.progression(maxRandomNumber, maxStepNumber, maxSizeProgression, minSizeProgression);
                break;
            case "6":
                Prime.prime(maxRandomNumber);
                break;
            default:
                break;
        }

    }
}
