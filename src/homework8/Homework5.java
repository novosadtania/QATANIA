package homework8;
  /* 5)  Написати програму "стрільба по цілі".
           Технічні вимоги:
           Даний квадрат 5х5, де програма випадковим чином ставить ціль.
           Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
           Сам процес гри обробляється у нескінченному циклі.
           гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
           Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
           Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
           Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле. Уражену ціль відзначити як x.
           Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
           Приклад виведення в консоль:

           0 | 1 | 2 | 3 | 4 | 5 |
           1 | - | - | - | - | - |
           2 | - | * | * | - | - |
           3 | * | - | - | * | - |
           4 | - | - | - | - | * |
           5 | * | - | * | - | - |
*/

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        String[][] name = new String[5][5];
        name[0][0] = "*";
        name[0][1] = "*";
        name[0][2] = "*";
        name[0][3] = "*";
        name[0][4] = "*";
        name[1][0] = "*";
        name[1][1] = "*";
        name[1][2] = "*";
        name[1][3] = "*";
        name[1][4] = "x";
        name[2][0] = "*";
        name[2][1] = "*";
        name[2][2] = "*";
        name[2][3] = "*";
        name[2][4] = "*";
        name[3][0] = "*";
        name[3][1] = "*";
        name[3][2] = "*";
        name[3][3] = "*";
        name[3][4] = "*";
        name[4][0] = "*";
        name[4][1] = "*";
        name[4][2] = "*";
        name[4][3] = "*";
        name[4][4] = "*";
        String[][] reseult = new String[5][5];
        for (int i = 0; i < reseult.length; i++) {
            for (int a = 0; a < reseult[i].length; a++) {
                reseult[i][a] = "-";
            }
        }
        for (String[] singleArray : reseult) {
            for (String text : singleArray) {
                System.out.print(text + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("All Set. Get ready to rumble!");
            System.out.println("Insert number(0-4):");
            String number1 = scanner.nextLine();
            System.out.println("Insert number(0-4):");
            String number2 = scanner.nextLine();

            reseult[Integer.parseInt(number1)][Integer.parseInt(number2)] = name[Integer.parseInt(number1)][Integer.parseInt(number2)];
            for (String[] singleArray2 : reseult) {
                for (String text : singleArray2) {
                    System.out.print(text + ", ");
                }
                System.out.print("\b\b");
                System.out.println();
            }
            if (number1.equals("1") && number2.equals("4")) {
                System.out.println("You have won!");
                for (String[] singleArray33 : name) {
                    for (String text33 : singleArray33) {
                        System.out.print(text33 + ", ");
                    }
                    System.out.print("\b\b");
                    System.out.println();
                }
                break;
            }
        }
    }
}