package hexlet.code;
import java.util.Random;
public class RandomNumber {
    //Метод возвращает случаенное число.
    public static int randomEvenNumber() {
        int evenNumber = 1;
        while (evenNumber % 2 != 0) {
            evenNumber = RandomNumber.randomNumber();
        }
        return Math.abs(evenNumber);
    }
    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static int naturalOrNegativeRandomNumber() {
        var random = new Random();
        return random.nextInt() % 100;
    }
}
