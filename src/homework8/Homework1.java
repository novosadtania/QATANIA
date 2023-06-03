package homework8;

public class Homework1 {
    /* 1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
     а также нечетные числа списком.*/
    public static void printOfNumbers(int[] arr) {
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 != 0)
                System.out.print(arr[x] + ", ");
        System.out.println(" ");
        for (int a = 0; a < arr.length; a++)
            if (arr[a] % 2 == 0)
                System.out.print(arr[a] + ", ");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 8, 4, 5, 6, 8, 5};
        printOfNumbers(arr);
    }
}