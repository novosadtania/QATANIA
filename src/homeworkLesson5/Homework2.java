package homeworkLesson5;

import java.util.Scanner;
/*2)Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanerNumber = new Scanner(System.in);

        System.out.println("Введіть число : ");
        int lastDigit, sum = 0, a;
        int inputNumber = scanerNumber.nextInt();
        a = inputNumber;

        while (a > 0) {
            lastDigit = a % 10;
            sum = (sum * 10) + lastDigit;
            a = a / 10;
        }
        if (sum == inputNumber)
            System.out.println("Number is palindrome ");
        else
            System.out.println("Number is not palindrome");
    }
}