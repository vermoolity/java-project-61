package hexlet.code;

import java.util.Scanner;

public class Greet {

    //Приветствуем пользователя и возвращаем имя.
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);

        return userName;
    }
}
