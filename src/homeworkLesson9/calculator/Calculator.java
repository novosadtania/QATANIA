package homeworkLesson9.calculator;

import java.util.Objects;
import java.util.Scanner;

/*4) Создать класс калькулятор.
    В нем создать методы:
    summ, minus, multiply, division.
            Сложение, вычитание, умножение и деление соответственно.
    Каждый метод принимает в качестве параметров два значения типа double.
    И выводит в консоль результат действия.
    Также в классе есть метод старт. Который выводит сообщение в консоль, что
    калькулятор запущен. И предлагает ввести действие в вашей консоли.
    Калькулятор должен принимать только следующие типы действий:
    2+4;    - пример синтаксиса сложения;
    5-6;    - пример синтаксиса вычитания;
    25*3;   - пример синтаксиса умножения;
    34/3;   - пример синтаксиса деления;
    После ввода действия на консоль выводится ответ этого действия.
    И после снова выводится сообщение о предложении ввести действие.
    в случае ввода другого синтаксисана консоль возвращается сообщение:
            "Введите корректное действие".
    И после снова выводится сообщение о предложении ввести действие.
    Программа закрывается после ввода команды Stop.
    Перед закрытием на консоль должно выводится сообщение:
    "Калькулятор закрыт".*/
public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void suma(double number1, double number2) {
        System.out.println("Результат : " + (number1 + number2));
    }

    public static void rizn(double number1, double number2) {
        System.out.println("Результат : " + (number1 - number2));
    }

    public static void mnozh(double number1, double number2) {
        System.out.println("Результат : " + (number1 * number2));
    }

    public static void dil(double number1, double number2) {
        System.out.println("Результат : " + (number1 / number2));
    }

    public static void start() {
        System.out.println("Калькулятор запущено!\n Для завершення введіть \"stop\" в полі вводу знаку. \n Введіть Номер 1, потім \"+\" або \"-\" або \"*\" або  \"/\", потім Номер 2: ");
    }


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;

    }
}


