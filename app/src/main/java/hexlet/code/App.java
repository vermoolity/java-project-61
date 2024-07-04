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
        //Запуск игры.
        switch (choice) {
            case "1":
                Greet.greeting();
                break;
            case "2":
                Even.even();
                break;
            case "3":
                Calc.calculator();
                break;
            case "4":
                GCD.gcd();
                break;
            case "5":
                Progression.progression();
                break;
            case "6":
                Prime.prime();
                break;
            default:
                break;
        }

    }
}
