package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static boolean even() {

        // Сгенерируем случайное число.
        var number = (int) (Math.random() * 100) + 1;
        System.out.println("Question: " + number);
        //
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        // Возвращаем правельный ответ.
        return Engine.answerUser(correctAnswer);
    }
}
