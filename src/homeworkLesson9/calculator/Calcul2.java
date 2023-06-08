package homeworkLesson9.calculator;

import java.util.Objects;
import java.util.Scanner;

import static homeworkLesson9.calculator.Calculator.start;

public class Calcul2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        start();
        while (true) {
            double number1 = scanner.nextDouble();
            String symbol = scanner.next();
            double number2 = scanner.nextDouble();
String stop = "stop";
            if (symbol.equalsIgnoreCase("stop")) {
                break;
            }
            else if (Objects.equals(symbol, "+")) {
                Calculator.suma(number1, number2);
            } else if (Objects.equals(symbol, "-")) {
                Calculator.rizn(number1, number2);
            } else if (Objects.equals(symbol, "*")) {
                Calculator.mnozh(number1, number2);
            } else if (Objects.equals(symbol, "/")) {
                Calculator.dil(number1, number2);
            } else {
                System.out.println("Ви ввели некоректну дію.");
            }
            System.out.println("Введіть знову дію  : ");
        }
        System.out.println("Калькулятор закрито.");
    }
}


