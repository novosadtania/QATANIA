package homeworkLesson5;

import java.util.Scanner;

/*4)Создать три массива.
        Первый будет состоять из следующих имен:
        "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
        Второй будет содержать следующие значения типа int:
        10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения:
        "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
        Пользователь вводит три числа с клавиатуры, которые будут соответствовать
        индексам каждого из элементов массивов.
        Пример1. после ввода 3,2,1:
        На экране должно вывестись следующее сообщение:
        "Федя будет идти в магазин в 14:00"
        Пример2. после ввода 1,2,3:
        На экране должно вывестись следующее сообщение:
        "Маша будет идти в тренажерный зал в 14:00"*/
public class Homework4 {
    public static void main(String[] args) {
        String[] arrayString1 = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон",};
        int[] arrayInt = new int[6];
        arrayInt[0] = 10;
        arrayInt[1] = 12;
        arrayInt[2] = 14;
        arrayInt[3] = 16;
        arrayInt[4] = 18;
        arrayInt[5] = 20;
        String[] arrayString2 = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 3 числа від 0 до 5 : ");
        int input1= scanner.nextInt();
        int input2= scanner.nextInt();
        int input3= scanner.nextInt();
        System.out.println(arrayString1[input1] + " буде йти в " + arrayString2[input2] + " в " + arrayInt[input3] + ":00.");

        }
    }
