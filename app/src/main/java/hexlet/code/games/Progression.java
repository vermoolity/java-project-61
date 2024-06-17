package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;

public class Progression {
    private static String[] creatingAnExample() {
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
    /*
    Метод вызывает движок и передает в него значение, такие как:
    Строку которую нужно вывести
    Пример
    Правельный ответ на вопрос
     */
    public static void progression() {
        String[] firstExampleAndAnswer = creatingAnExample();
        String firstExample = firstExampleAndAnswer[0];
        String firstCorrectNumber = firstExampleAndAnswer[1];
        String[] secondExampleAndAnswer = creatingAnExample();
        String secondExample = secondExampleAndAnswer[0];
        String secondCorrectNumber = secondExampleAndAnswer[1];
        String[] thirdExampleAndAnswer = creatingAnExample();
        String thirdExample = thirdExampleAndAnswer[0];
        String thirdCorrectNumber = thirdExampleAndAnswer[1];
        var question = "Find the greatest common divisor of given numbers.";
        Engine.engine(question, firstExample, firstCorrectNumber, secondExample, secondCorrectNumber,
                thirdExample, thirdCorrectNumber);
    }
}
