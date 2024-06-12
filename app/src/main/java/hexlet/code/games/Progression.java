package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;

public class Progression {
    public static boolean progression() {

        var random = new Random();
        // Сгенерируем случайное число на сколько каждое число будет больше предыдущего числа в данной прогрессии.
        int plusNumber = (int) (Math.random() * 11) + 1;
        ArrayList<String> numbers = new ArrayList<String>();
        // Сгенерируем случайное первое число прогресии.
        var sequentialNumber = (int) (Math.random() * 101) + 1;
        // Сгенерируем случайную длину прогрессии.
        var randomSize = (int) (Math.random() * 6) + 5;
        // Сгенерируеи прогрессию в виде списка.
        for (var i = 0; i < randomSize; i++) {
            sequentialNumber = sequentialNumber + plusNumber;
            numbers.add(sequentialNumber + "");
        }
        // Случаиное число из списка которое нужно найти.
        var secretNumber = numbers.get(random.nextInt(numbers.size()));
        var question = "Question:";
        for (var number : numbers) {
            if (number.equals(secretNumber)) {
                question = question + " " + "..";
            } else {
                question = question + " " + number;
            }
        }
        System.out.println(question);
        // Возвращаем правельный ответ.
        return Engine.answerUser(secretNumber + "");
    }
}
