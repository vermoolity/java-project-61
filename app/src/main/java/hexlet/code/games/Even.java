package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

public class Even {

    //Метод возвращает
    private static String[] isEven() {
        String number = RandomNumber.randomNumber() + "";
        String correctAnswer = Integer.parseInt(number) % 2 == 0 ? "yes" : "no";
        return new String[] {number, correctAnswer};
    }
    public static void even() {

        var question = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";

        Engine.engine(question,
                isEven(),
                isEven(),
                isEven());
    }
}