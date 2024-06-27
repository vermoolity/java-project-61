package hexlet.code;
import java.util.Random;

public class RandomNumber {
    //Метод возвращает случаенное число.
    public static int randomNumber() {
        return (int) (Math.random() * 101) + 1;

}
    public static int naturalOrNegativeRandomNumber() {
    var random = new Random();
    return random.nextInt() % 100;
}
}
