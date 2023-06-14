package taniaForMe;

import java.util.Scanner;

/*Используя рекурсию напишите метод, который будет выводить
      введенное число в обратном порядке, так чтобы каждая
      цифра писалась два раза, после ставился пробел, и вторая
      цифра тоже писалась два раза и после ставился пробел...
      Пример: вы вводите 563
      вывод будет следующий 33 66 55*/
public class Less11 {
    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Integer");
        recursIntOutput(scanner.nextInt());
    }

    public static void recursIntOutput(int nummber) {
        System.out.print(nummber % 10 + "" + nummber % 10 + " ");
        if (nummber / 10 == 0) {
            System.out.println("\nПрограма завершилась");
        } else {
            nummber = nummber / 10;
            recursIntOutput(nummber);
        }

    }

    public static void main(String[] args) {
        input();
    }
}
