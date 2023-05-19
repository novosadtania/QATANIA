package homework14_05;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {


        Scanner input5 = new Scanner(System.in);
        System.out.println("Введіть число від 1 до 7 : ");
        int xx = input5.nextInt();
        if (xx == 1) {
            System.out.println("Понеділок");
        } else if (xx == 2) {
            System.out.println("Вівторок");
        } else if (xx == 3) {
            System.out.println("Cереда");
        } else if (xx == 4) {
            System.out.println("Четвер");
        } else if (xx == 5) {
            System.out.println("П'ятниця");
        } else if (xx == 6) {
            System.out.println("Субота");
        } else if (xx == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("Краще б сьогодні була п'ятниця");
        }

    }
}
