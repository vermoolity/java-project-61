package hexlet.code;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Выводим список игр.
        String[] startingLines = {"Please enter the game number and press Enter.", "1 - Greet", "2 - Even",
            "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
        for (var line : startingLines) {
            System.out.println(line);
        }

        Scanner scanner = new Scanner(System.in);
        //Пользователь делает свой выбор.
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        System.out.println("");

        String[] gameNumbers = {"2", "3", "4", "5", "6"};

        // Проверяем присутсвует ли номер введенный пользователем.
        if (choice.equals("1")) {
            Greet.greeting();

        } else if (ArrayUtils.contains(gameNumbers, choice)) {
            Engine.startGame(choice);
        }

    }
}
