package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "0":
                break;
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Greet.greet();
                break;
            case "2":
                Even.even();
                break;
            default:
                break;
        }
    }
}
