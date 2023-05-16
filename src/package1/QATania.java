package package1;

import java.util.Date;
import java.util.Scanner;
public class QATania {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть  ваше число ");
        int x = input.nextInt();
        System.out.println("Введіть ваше 2 число ");
        int y = input.nextInt();
        boolean result = x > y? true : false;
        String string = "Число " + x + " більше за "  + y +" і це " + result;
        System.out.print(string);

    }
}
