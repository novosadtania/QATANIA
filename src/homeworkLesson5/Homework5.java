package homeworkLesson5;


import java.util.Random;
import java.util.Scanner;

/*Есть одномерный массив из 10 элементов, заполнен-
        ный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном
        до этого массиве.*/
public class Homework5 {
    public static void main(String[] args) {


        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
//            System.out.print("Массив" + array[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int number = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }
    }
}