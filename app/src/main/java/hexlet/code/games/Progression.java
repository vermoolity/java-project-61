package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Progression {

    // Метод генерирует прогрессию.
    private static List<String> progression(int size, int firstNumber, int stepNumber) {
        ArrayList<String> progression = new ArrayList<String>();

        var sequentialNumber = firstNumber;
        // Сгенерируеи прогрессию в виде списка.
        for (var i = 0; i < size; i++) {
            sequentialNumber = sequentialNumber + stepNumber;
            progression.add(sequentialNumber + "");
        }
        // Возвращаем прогруссию.
        return progression;
    }
    private static String[] progressionQuestionAndAnswer(
            int maxFirstNumber, int maxStepNumber, int maxSize, int minSize) {
        var random = new Random();
        // Сгенерируем случайное первое число прогресии.
        var firstNumber = RandomNumber.randomNumber(maxFirstNumber);
        // Сгенерируем случайную длину прогрессии.
        var randomSize = RandomNumber.randomNumber(maxSize, minSize);
        // Сгенерируем случайное число на сколько каждое число будет больше предыдущего числа в данной прогрессии.
        var stepNumber  = RandomNumber.randomNumber(maxStepNumber);
        // Сгенерируеи прогрессию в виде списка.
        List<String> progression = progression(randomSize, firstNumber, stepNumber);
        // Случаиное число из списка которое нужно найти.
        var secretNumber = progression.get(random.nextInt(progression.size()));
        var question = "";
        for (var number : progression) {
            if (number.equals(secretNumber)) {
                question = question + " " + "..";
            } else {
                question = question + " " + number;
            }
        }
        return new String[] {question, secretNumber};
    }

    public static void progression(int maxFirstNumber, int maxStepNumber, int maxSize, int minSize) {

        var gameRules = "What number is missing in the progression?";

        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(progressionQuestionAndAnswer(maxFirstNumber, maxStepNumber, maxSize, minSize));
        }

        Engine.engine(gameRules, questionsAndAnswers);
    }
}
