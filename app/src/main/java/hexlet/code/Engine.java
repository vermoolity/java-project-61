package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    // Логика ответов пользователя.
    public static boolean answerUser(String correctAnswer) {

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);
        boolean result = false;
        // Проверка ответа пользователя.
        if (userAnswer.equals(correctAnswer)) {
            result = true;
            // Меняем флаг на true.
            System.out.println("Correct!");

        } else {
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + correctAnswer + "\'.");
        }
        return result;
    }
    // Логика начало игры.
    public static void startGame(String choice) {
        // Привествуем игрока и узнаём имя
        String name = Greet.greeting();
        boolean result = false;
        var message = Map.of(
                "2", "Answer \'yes\' if the number is even, otherwise answer \'no\'.",
                "3", "What is the result of the expression?",
                "4", "Find the greatest common divisor of given numbers.",
                "5", "What number is missing in the progression?",
                "6", "Answer \'yes\' if the number is even, otherwise answer \'no\'.");
        System.out.println(message.get(choice));

        for (var i = 0; i < 3; i++) {
            // включение выбранной игры.
            switch (choice) {
                case "2":
                    result = Even.even();
                    break;
                case "3":
                    result = Calc.calculator();
                    break;
                case "4":
                    result = GCD.gcd();
                    break;
                case "5":
                    result = Progression.progression();
                    break;
                case "6":
                    result = Prime.prime();
                    break;
                default:
                    break;
            }
            // Продолжаем игру если пользователь ответил правельно, иначе цикл обрывается.
            if (result) {
                continue;
            } else {
                break;
            }
        }
        // Узнаём выиграл ли пользователь в игре.
        if (result) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }

    }
}
