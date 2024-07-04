package hexlet.code;
import java.util.List;
import java.util.Scanner;

public class Engine {
    /*
    Метод который работает с пользователем.
    Если ответ пользователя верный то метод возвращает true.
    Если ответ пользователя неверный то метод возвращает false.
     */

    private static boolean userResponse(String question, String correctAnswer) {
        Scanner scanner = new Scanner(System.in);

        //Выводит ворос.
        System.out.println("Question: " + question);

        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);
        boolean result;
        //Проверяем дал ли пользователь верный ответ.
        if (userAnswer.equals(correctAnswer)) {
            result = true;
            //Если ответ верный выводим это.
            System.out.println("Correct!");

        } else {
            result = false;
            //Если ответ неверный выводим это.
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + correctAnswer + "\'.");
        }
        return result;

    }
    //Движок игры.
    public static void engine(String rules, List<String[]> questionsAndAnswers) {
        int numberOfRounds = 3;
        String name = Greet.greeting();

        System.out.println(rules);
        boolean flag = true;
        for (var i = 0; i < numberOfRounds && flag; i++) {
            var question = questionsAndAnswers.get(i)[0];
            var correctAnswer = questionsAndAnswers.get(i)[1];
            flag = userResponse(question, correctAnswer);
        }
        if (flag) {
            //Выводит строку если пользователь дал верные ответы.
            System.out.println("Congratulations, " + name + "!");
        } else {
            //Выводит строку если пользователь дал неверный ответ на пример.
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
