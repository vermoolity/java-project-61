package hexlet.code;

import org.apache.commons.lang3.ArrayUtils;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        String[] gameNumbers = {"2", "3", "4", "5"};
        if (choice.equals("1")) {
            Greet.greet();
        } else if (ArrayUtils.contains(gameNumbers, choice)) {
            Engine.startGame(choice);
        }

    }
}
