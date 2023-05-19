package homework14_05;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть сторону трикутника:");
        int a = in.nextInt();
        System.out.println("Введіть сторону трикутника:");
        int b = in.nextInt();
        System.out.println("Введіть сторону трикутника:");
        int c = in.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Із цих сторін можна побудувати трикутник");
        } else {
            System.out.println("Із цих сторін не можна побудувати трикутник");
        }

    }
}
