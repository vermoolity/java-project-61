package hexlet.code;
import java.util.List;
import java.util.Scanner;

public class Engine {
    public static final int ROUND = 3;
    private static String userName;
    /*
    Метод который работает с пользователем.
    Если ответ пользователя верный то метод возвращает true.
    Если ответ пользователя неверный то метод возвращает false.
     */
    public static void userEntersHisName() {
        Scanner scanner = new Scanner(System.in);
        Engine.userName = scanner.next();
    }
    public static void greetingsAndQuestion() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userEntersHisName();
        System.out.println("Hello, " + Engine.userName + "!");
    }
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
        // Количество раундов игры.
        // Приветсвуем пользователя и узнаем его имя.
        greetingsAndQuestion();
        // Выводим на консоль правила игры.
        System.out.println(rules);
        boolean flag = true;
        // Цикл продолжается пока не пройдут все раунды, и пока пользователь даёт верные ответыю
        for (var i = 0; i < Engine.ROUND && flag; i++) {

            var question = questionsAndAnswers.get(i)[0];
            var correctAnswer = questionsAndAnswers.get(i)[1];

            flag = userResponse(question, correctAnswer);
        }
        if (flag) {
            //Выводит строку если пользователь дал верные ответы.
            System.out.println("Congratulations, " + Engine.userName + "!");
        } else {
            //Выводит строку если пользователь дал неверный ответ на пример.
            System.out.println("Let's try again, " + Engine.userName + "!");
        }
    }
}
