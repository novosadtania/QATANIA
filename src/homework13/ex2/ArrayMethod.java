package homework13.ex2;
/*2) Создать метод, в котором создается одномерный массив типа int произвольного размера
от 1 до 30, в котором каждому элементу массива присваивается произвольное значение от
0 до 30.
Данный метод спрашивает у пользователя ввести с клавиатуры индекс случайно сгенерированного массива.
Метод возвращает значение типа double, которое получается при делении элемента с указанным
индексом пользователя на первый элемент данного массива.

Продумать все возможные исключительные ситуации, которые могут возникнуть в данном методе.
Для каждой исключительной ситуации создать собственный класс checked исключения.
Прописать в методе условия генерации данных исключений, а также указать их в сигнатуре данного
метода.

Обработку исключения осуществить в сторонеем классе Main в котором нужно вызвать данный метод.*/

import java.util.Random;
import java.util.Scanner;

public class ArrayMethod {
    static int getNumber(int number) throws UnderZeroException {
        if (number < 0) {
            throw new UnderZeroException();
        }
        return number;
    }

    static int getArrayIndex(int number) throws LargeIndex {
        int[] array = new int[31];
        if (number > array.length) {
            throw new LargeIndex();
        }
        return number;
    }

    public void arrayMethod() throws UnderZeroException, LargeIndex {
        System.out.println("Введіть індекс масиву від 0 до 30 : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[31];
        getNumber(number);
        getArrayIndex(number);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
            System.out.print(array[i] + " ");
        }

        double array1 = array[number];
        double array2 = array[0];
        System.out.println();
        double result = array1 / array2;
        System.out.println(" Результат : " + result);
    }
}
