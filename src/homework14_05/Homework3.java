package homework14_05;

import java.util.Date;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть рік вашого народження:");
        int yearOfBirth = in.nextInt();
        Date date = new Date();

        System.out.println(date);

        String actualYear = String.format("%tY", date);

        int actualYearInt = Integer.parseInt(actualYear);
        System.out.println("Ваш вік : " + (actualYearInt - yearOfBirth));
    }
}
