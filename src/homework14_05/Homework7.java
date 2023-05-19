package homework14_05;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть вашу ОС: LiNux, macOS, Windows");
        String os = in.nextLine();
        String programm;
        switch (os.toUpperCase()) {
            case ("LINUX"):
                System.out.println("Введіть вашу програму: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваше посилання на intellij, linux : https://www.jetbrains.com/ru-ru/idea/download/ ");
                        break;
                    case ("git"):
                        System.out.println("Ваше посилання на git, linux : https://git-scm.com/ ");
                        break;
                    case ("java"):
                        System.out.println("Ваше посилання на java, linux : https://www.oracle.com/cis/java/technologies/downloads/#java17 ");
                        break;
                    default:
                        System.out.println("Такої програми мы не знайшли");
                }
                break;
            case ("MACOS"):
                System.out.println("Введіть вашу програму: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваше посилання на intellij, macos : https://www.jetbrains.com/ru-ru/idea/download/ ");
                        break;
                    case ("git"):
                        System.out.println("Ваше посилання на git, macos : https://git-scm.com/ ");
                        break;
                    case ("java"):
                        System.out.println("Ваше посилання на java, macos : https://www.oracle.com/cis/java/technologies/downloads/#jdk17-mac");
                        break;
                    default:
                        System.out.println("Такої програми мы не знайшли");
                }


                break;
            case ("WINDOWS"):
                System.out.println("Введіть вашу програму: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваше посилання  на intellij, windows : https://www.jetbrains.com/ru-ru/idea/download/ ");
                        break;
                    case ("git"):
                        System.out.println("Ваше посилання на git, windows : https://git-scm.com/ ");
                        break;
                    case ("java"):
                        System.out.println("Ваше посилання на java, windows : https://www.oracle.com/cis/java/technologies/downloads/#jdk17-windows ");
                        break;
                    default:
                        System.out.println("Такої програми ми не знайшли");
                }

                break;
            default:
                System.out.println("Такої ОС не знайдено");
        }
    }
}

