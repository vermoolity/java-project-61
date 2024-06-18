package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    //Метод возвращает случаенное число.
    private static String randomNumber() {
        var number = (int) (Math.random() * 101) + 1;
        return String.format(String.valueOf(number));
    }
    //Метод возвращает ответ на вопрос простое число или нет.
    private static String isPrime(String stringNumber) {
        var number = Integer.parseInt(stringNumber);
        String correctAnswer = "yes";
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
            }
        }
        //Возвращает ответ.
        return correctAnswer;
    }
    /*
    Метод вызывает движок и передает в него значение, такие как:
    Строку которую нужно вывести
    Пример
    Правельный ответ на вопрос
    */
    public static void prime() {

        String firstNumber = randomNumber();
        String firstCorrectNumber = isPrime(firstNumber);

        String secondNumber = randomNumber();
        String secondCorrectNumber = isPrime(secondNumber);

        String thirdNumber = randomNumber();
        String thirdCorrectNumber = isPrime(thirdNumber);

        var question = "Answer \'yes\' if given number is prime. Otherwise answer \'no\'.";

        Engine.engine(question, firstNumber, firstCorrectNumber, secondNumber, secondCorrectNumber,
                thirdNumber, thirdCorrectNumber);
    }
}
