package hexlet.code;
import java.util.Scanner;

public class Engine {
    /*
    Метод который работает с пользователем.
    Если ответ пользователя верный то метод возвращает true.
    Если ответ пользователя неверный то метод возвращает false.
     */

    private static boolean answer(String example, String correctAnswer) {
        Scanner scanner = new Scanner(System.in);

        //Выводит вопрос.
        System.out.println("Question: " + example);

        String userAnswer = scanner.next();
        boolean flag;
        //Проверяем дал ли пользователь верный ответ.
        if (userAnswer.equals(correctAnswer)) {
            flag = true;
            //Если ответ верный выводим это.
            System.out.println("Correct!");

        } else {
            flag = false;
            //Если ответ неверный выводим это.
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + correctAnswer + "\'.");
        }
        return flag;

    }
    //Движок игры.
    public static void engine(String question,
                              String firstExample,
                              String firstCorrectAnswer,
                              String secondExample,
                              String secondCorrectAnswer,
                              String thirdExample,
                              String thirdCorrectAnswer) {
        String name = Greet.greeting();
        //Выводит передоваемую строку.
        System.out.println(question);
        if (answer(firstExample, firstCorrectAnswer)
                && answer(secondExample, secondCorrectAnswer)
                && answer(thirdExample, thirdCorrectAnswer)) {
            //Выводит строку если пользователь дал верные ответы.
            System.out.println("Congratulations, " + name + "!");
        } else {
            //Выводит строку если пользователь дал неверный ответ на пример.
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
