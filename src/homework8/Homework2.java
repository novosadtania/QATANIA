package homework8;

public class Homework2 {
  /*   2) Написать перегруженный метод, который может:
         - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
         "Я пустой".
         - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
         - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
         через пробел.
         - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
         массива.
         - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
         "Ваше сообщение - "%%%%%%%%", ваше число -  $",
         где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/


    public static void metodPeregruz() {
        System.out.println("Я пустой");
    }

    public static void metodPeregruz(String string) {
        System.out.println(string);
    }

    public static void metodPeregruz(String[] arrayString) {
        for (int x = 0; x < arrayString.length; x++)
            System.out.print(arrayString[x] + " ");
        System.out.println("");}

    public static void metodPeregruz(int[] arrayInt) {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum = sum + arrayInt[i];
        }
        System.out.println(sum);
    }
    public static void metodPeregruz(int number, String text) {
        System.out.println("Ваше повідомлення: " + text);
        System.out.println("Ваше число: " + number);
    }

    public static void main(String[] args) {
        metodPeregruz();

        metodPeregruz("My text");

        String[] arrayString = {" fhhgfh","fjfjfjjf"};
        metodPeregruz(arrayString);

        int[] arrayInt = {33,99,88,99};
        metodPeregruz(arrayInt);

        metodPeregruz(56, "sjsjsj");

    }

    }


