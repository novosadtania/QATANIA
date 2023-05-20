package homeworkLesson6;

import java.util.Scanner;

public class Homework1 {
    /*1)Написать программу, которая будет считывать введенные пользователем
   слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
   пока пользователь не введет с клавитуры слово STOP.
   Все слова введенные до этого должны отобразится в консоли
   одним предложением.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        while (true) {
            System.out.println("Введіть ваше слово(для зупинки напишіть STOP)");
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            result = result + " " + input;
            System.out.println(result);

        }
        System.out.println(result);
        }
    }
