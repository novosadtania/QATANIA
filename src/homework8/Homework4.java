package homework8;
/* 4)  Пользователь задает размерность двумерного массива с клавиатуры.
    Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.*/

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("size");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int[][] arrayInt = new int[number1][number2];

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = (int) ((Math.random() * 1000));
                Arrays.sort(arrayInt[i]);
                System.out.print(arrayInt[i][a] + " ,");

            }
            System.out.print("\b\b");
            System.out.println();


    }


}}
