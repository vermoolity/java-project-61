package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Progression {
    private static final int MAX_RANDOM_NUMBER = 100;
    private  static final int MAX_STEP_NUMBER = 10;
    private  static final int MAX_SIZE_PROGRESSION = 10;
    private  static final int MIN_SIZE_PROGRESSION = 6;
    private static final String GAME_RULES = "What number is missing in the progression?";


    // Метод генерирует прогрессию.
    private static List<String> listProgression(int size, int firstNumber, int stepNumber) {
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
    private static String stringProgression(List<String> listProgression, String secretNumber) {
        var question = "";

        for (var number : listProgression) {
            if (number.equals(secretNumber)) {
                question = question + "..";

            } else {
                question = question + number;
            }

            question = question + " ";
        }
        return question;
    }
    private static String[] progressionQuestionAndAnswer(int firstNumber,
                                                         int randomSize,
                                                         int stepNumber) {
        var random = new Random();
        // Сгенерируеи прогрессию в виде списка.
        List<String> progression = listProgression(randomSize, firstNumber, stepNumber);
        // Случаиное число из списка которое нужно найти.
        var secretNumber = progression.get(random.nextInt(progression.size()));

        var question = stringProgression(progression, secretNumber);

        return new String[] {question, secretNumber};
    }

    public static void progression() {
        ArrayList<String[]> questionsAndAnswers = new ArrayList<String[]>();

        for (var i = 0; i != Engine.ROUND; i++) {
            questionsAndAnswers.add(progressionQuestionAndAnswer(
                    RandomNumber.randomNumber(MAX_RANDOM_NUMBER),
                    RandomNumber.randomNumber(MAX_SIZE_PROGRESSION, MIN_SIZE_PROGRESSION),
                    RandomNumber.randomNumber(MAX_STEP_NUMBER)));
        }

        Engine.engine(GAME_RULES, questionsAndAnswers);
    }
}
