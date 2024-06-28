package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {
    public static boolean prime() {

        // Сгенерируем случайное число.
        var number = (int) (Math.random() * 101) + 1;

        System.out.println("Question: " + number);
        String correctAnswer = "Yes";
        // Узнаем число number простое или нет.
        for (int i = 2; i < number / 2 ; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
            }
        }
        // Возвращаем правельный ответ.
        return Engine.answerUser(correctAnswer);

    }
}