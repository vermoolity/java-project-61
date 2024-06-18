package hexlet.code;

public class RandomNumber {
    //Метод возвращает случаенное число.
    public static int randomNumber() {
        return (int) (Math.random() * 101) + 1;
    }
}
