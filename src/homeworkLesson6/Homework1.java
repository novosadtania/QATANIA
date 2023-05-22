package homeworkLesson6;
/*Написати програму "числа", яка загадує випадкове число та пропонує гравцеві його вгадати.

        Технічні вимоги:

        За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
        та пропонує гравцеві через консоль ввести своє ім'я, яке зберігається в змінній name.
        Перед початком на екран виводиться текст: Let the game begin!

        Сам процес гри обробляється у нескінченному циклі.
        Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану
        кількість з тим, що ввів користувач.
        Якщо введене число менше загаданого, програма виводить на екран текст:
        Your number is too small. Please, try again.. Якщо введене число більше за загадане,
        то програма виводить на екран текст: Your number is too big. Please, try again..
        Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!

        Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let the game begin! ");
        System.out.println("Write your name : ");
        String name = scanner.nextLine();
        System.out.println("Let the game begin," + name);
        System.out.println("Введіть число від 0 до 100");
        int a = scanner.nextInt();
        int u = random.nextInt(100);
        int[] arrayInt = new int[100];
        System.out.println("Рандомне число : " + u);
        while (a != u) {
            if (a < u) {
                System.out.println("Your number is too small. Please, try again.. ");
                int aa = scanner.nextInt();
                a = aa;
            }
            if (a > u) {
                System.out.println("Your number is too big. Please, try again..");
                int ab = scanner.nextInt();
                a = ab;
            }
            if (a == u) {
                System.out.println("Congratulations," + name + "!");
                break;
            }

        }
    }
}
