package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    //Метод возвращает случаенное число.
    private static String randomNumber() {
        var number = (int) (Math.random() * 101) + 1;
        return String.format(String.valueOf(number));
    }
    //Метод возвращает ответ на вопрос чётное ли число или нет.
    private static String isEven(String stringNumber) {
        var number = Integer.parseInt(stringNumber);
        return number % 2 == 0 ? "yes" : "no";

    }
    /*
    Метод вызывает движок и передает в него значение, такие как:
    Строку которую нужно вывести
    Пример
    Правельный ответ на вопрос
     */
    public static void even() {
        String firstNumber = randomNumber();
        String firstCorrectNumber = isEven(firstNumber);
        String secondNumber = randomNumber();
        String secondCorrectNumber = isEven(secondNumber);
        String thirdNumber = randomNumber();
        String thirdCorrectNumber = isEven(thirdNumber);
        var question = "Answer \\'yes\\' if the number is even, otherwise answer \\'no\\'.";
        Engine.engine(question, firstNumber, firstCorrectNumber, secondNumber, secondCorrectNumber,
                thirdNumber, thirdCorrectNumber);



    }
}
