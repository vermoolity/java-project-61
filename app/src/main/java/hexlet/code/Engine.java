package hexlet.code;
import java.util.Scanner;

public class Engine {
    /*
    Метод который работает с пользователем.
    Если ответ пользователя верный то метод возвращает true.
    Если ответ пользователя неверный то метод возвращает false.
     */

    private static boolean answer(String[] answerAndExample) {
        Scanner scanner = new Scanner(System.in);

        var example = answerAndExample[0];
        var correctAnswer = answerAndExample[1];

        //Выводит вопрос.
        System.out.println("Question: " + example);

        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);
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
                              String[] firstaAnswerAndExample,
                              String[] secondAnswerAndExample,
                              String[] thirdAnswerAndExample) {
        String name = Greet.greeting();
        //Выводит передоваемую строку.
        System.out.println(question);
        if (answer(firstaAnswerAndExample)
                && answer(secondAnswerAndExample)
                && answer(thirdAnswerAndExample)) {
            //Выводит строку если пользователь дал верные ответы.
            System.out.println("Congratulations, " + name + "!");
        } else {
            //Выводит строку если пользователь дал неверный ответ на пример.
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
