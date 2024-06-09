package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;

public class Progression {
    public static boolean progression() {
        var random = new Random();
        var plusNumber = (int) (Math.random() * 11) + 1;
        ArrayList<String> numbers = new ArrayList();
        var sequentialNumber = (int) (Math.random() * 100) + 1;
        // Сгенерируем случайное первое число прогресии.
        var randomSize = (int) (Math.random() * 6) + 5;
        // Сгенерируем случайную длину прогрессии.
        for (var i = 0; i < randomSize; i++) {
            sequentialNumber = sequentialNumber + plusNumber;
            numbers.add(sequentialNumber + "");
        }
        // Сгенерируеи прогрессию в виде списка.
        var secretNumber = numbers.get(random.nextInt(numbers.size()));
        // Случаиное число из списка которое нужно найти.
        var question = "Question:";
        for (var number : numbers) {
            if (number.equals(secretNumber)) {
                question = question + " " + "..";
            } else {
                question = question + " " + number;
            }
        }
        System.out.println(question);
        return Engine.answerUser(secretNumber + "");
    }
}
