package hexlet.code;

import java.util.Random;

public class RandomOperator {

    //Метод генерирует случайный оператор
    public static String randomOperator() {
        var random = new Random();

        String[] operators = {"-", "+", "*"};

        //Сгенерируем случайный оператор.
        var operator = operators[random.nextInt(operators.length)];
        return operator;
    }
}
