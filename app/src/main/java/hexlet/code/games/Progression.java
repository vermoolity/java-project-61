package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;
import java.util.Random;

public class Progression {
    private static String[] progressionExampleAndAnswer() {
        var random = new Random();
        // Сгенерируем случайное число на сколько каждое число будет больше предыдущего числа в данной прогрессии.
        int plusNumber = (int) (Math.random() * 11) + 1;
        ArrayList<String> numbers = new ArrayList<String>();
        // Сгенерируем случайное первое число прогресии.
        var sequentialNumber = RandomNumber.randomNumber();
        // Сгенерируем случайную длину прогрессии.
        var randomSize = (int) (Math.random() * 6) + 5;
        // Сгенерируеи прогрессию в виде списка.
        for (var i = 0; i < randomSize; i++) {
            sequentialNumber = sequentialNumber + plusNumber;
            numbers.add(sequentialNumber + "");
        }
        // Случаиное число из списка которое нужно найти.
        var secretNumber = numbers.get(random.nextInt(numbers.size()));
        var question = "";
        for (var number : numbers) {
            if (number.equals(secretNumber)) {
                question = question + " " + "..";
            } else {
                question = question + " " + number;
            }
        }
        return new String[] {question, secretNumber};

    }

    public static void progression() {

        var question = "What number is missing in the progression?";

        Engine.engine(question, progressionExampleAndAnswer(),
                progressionExampleAndAnswer(),
                progressionExampleAndAnswer());
    }
}
