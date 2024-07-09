package hexlet.code;
import java.util.Random;
public class RandomNumber {
    // Метод генерирует всегда натуральное четное число
    public static int randomEvenNumber(int max) {
        int evenNumber = 1;
        while (evenNumber % 2 != 0) {
            evenNumber = RandomNumber.randomNumber(max);
        }
        return Math.abs(evenNumber);
    }
    // Метод принимает параметры: минимальное число, максимальное число,
    // метод генерирует в пределах этих числах натуральное число.
    public static int randomNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }
    // Метод генерирует случайное натуральное или отрицательное число.
    public static int randomNumber(int max, int min) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static int naturalOrNegativeRandomNumber(int max) {
        var random = new Random();
        return random.nextInt() % max;
    }
}
