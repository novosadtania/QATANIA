package homework14_05;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your number1:");
        int number1 = in.nextInt();

        System.out.println("Insert your number2:");
        int number2 = in.nextInt();

        System.out.println("Insert your symbol: ");
        String action = in.next();
        int result = action.equals("+") ? number1 + number2 :
                action.equals("-") ? number1 - number2 :
                        action.equals("*") ? number1 * number2 :
                                action.equals("/") ? number1 / number2 :
                                        action.equals("%") ? number1 % number2 : 0;
        System.out.println(result);
    }
}

