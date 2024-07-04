package hexlet.code;
import java.util.Random;
public class RandomNumber {
    // Метод генерирует всегда натуральное четное число
    public static int randomEvenNumber() {
        int evenNumber = 1;
        while (evenNumber % 2 != 0) {
            evenNumber = RandomNumber.randomNumber();
        }
        return Math.abs(evenNumber);
    }
    // Метод генерирует натуральное число.
    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
    // Метод принимает параметры: минимальное число, максимальное число,
    // метод генерирует в пределах этих числах натуральное число.
    public static int randomNumber(int max, int min) {
        return (int) (Math.random() * max) + min;
    }
    // Метод генерирует случайное натуральное или отрицательное число.
    public static int naturalOrNegativeRandomNumber() {
        var random = new Random();
        return random.nextInt() % 100;
    }
}
