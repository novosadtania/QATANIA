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

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void showField(String[][] field) {
        for (String[] strings : field) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static String[][] createField(int raws, int columns) {
        String[][] field = new String[raws][columns];
        for (int raw = 0; raw < raws; raw++) {
            if (raw == 0) {
                for (int colum = 0; colum < columns; colum++) {
                    field[raw][colum] = String.valueOf(colum);
                }
            }
            if (raw != 0) {
                for (int colum = 0; colum < columns; colum++) {
                    if (colum == 0) {
                        field[raw][colum] = String.valueOf(raw);
                    } else {
                        field[raw][colum] = "-";
                    }
                }
            }
        }
        return field;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] field = createField(6, 6);
        int aimRaw = ((int) (Math.random() * 5) + 1);
        int aimColumn = ((int) (Math.random() * 5) + 1);
        System.out.println("All set. Get ready to rumble!");
        showField(field);
        while (true) {
            int myRaw;
            while (true) {
                System.out.println("Insert Raw. Integer between 1 and 5");
                myRaw = scanner.nextInt();
                if (myRaw < 6 && myRaw > 0) {
                    break;
                }
            }
            int myColumn;
            while (true) {
                System.out.println("Insert Column. Integer between 1 and 5");
                myColumn = scanner.nextInt();
                if (myColumn < 6 && myColumn > 0) {
                    break;
                }
            }
            if (myColumn == aimColumn && myRaw == aimRaw){
                field[myRaw][myColumn]="x";
                showField(field);
                break;
            }else {
                field[myRaw][myColumn]="*";
                showField(field);
            }
        }
    }
}