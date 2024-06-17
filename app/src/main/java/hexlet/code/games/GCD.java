package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    //Метод возвращает чётное случаенное число.
    private static int randomEvenNumber() {
        int evenNumber = 1;
        while (evenNumber % 2 != 0) {
            evenNumber = (int) (Math.random() * 100) + 1;
        }
        return Math.abs(evenNumber);
    }
    public static String[] creatingAnExample() {
        var numberOne = randomEvenNumber();
        var numberTwo = randomEvenNumber();

        //Узнаем на какое наибольшее число делятся данные числа.
        while (numberTwo != 0) {
            int a = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = a;
        }
        String example = numberOne + " " + numberTwo;
        String correctAnswer = numberOne + "";

        //Возвращаем пример и верный ответ.
        return new String[] {example, correctAnswer};
    }
    /*
    Метод вызывает движок и передает в него значение, такие как:
    Строку которую нужно вывести
    Пример
    Правельный ответ на вопрос
    */
    public static void gcd() {
        String[] firstExampleAndAnswer = creatingAnExample();
        String firstExample = firstExampleAndAnswer[0];
        String firstCorrectNumber = firstExampleAndAnswer[1];
        String[] secondExampleAndAnswer = creatingAnExample();
        String secondExample = secondExampleAndAnswer[0];
        String secondCorrectNumber = secondExampleAndAnswer[1];
        String[] thirdExampleAndAnswer = creatingAnExample();
        String thirdExample = thirdExampleAndAnswer[0];
        String thirdCorrectNumber = thirdExampleAndAnswer[1];
        var question = "Find the greatest common divisor of given numbers.";
        Engine.engine(question, firstExample, firstCorrectNumber, secondExample, secondCorrectNumber,
                thirdExample, thirdCorrectNumber);
    }
}
