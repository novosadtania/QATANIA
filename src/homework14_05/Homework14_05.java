package homework14_05;

public class Homework14_05 {
    public static void main(String[] args) {
//       1.
        //Я тестую чудово. Що ще потрібно?
       /* Scanner input = new Scanner(System.in);
        System.out.println("Введіть строку: ");

        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.next() + " " + input.next() + " " + input.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
*/

//    2.
   /* Scanner input = new Scanner(System.in);
         Scanner in = new Scanner(System.in);
        System.out.println("Введіть сторону трикутника:");
        int a = in.nextInt();
        System.out.println("Введіть сторону трикутника:");
        int b = in.nextInt();
        System.out.println("Введіть сторону трикутника:");
        int c = in.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Із цих сторін можна побудувати трикутник");
        } else {
            System.out.println("Із цих сторін не можна побудувати трикутник");
        }*/

//     3
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введіть рік вашого народження:");
        int yearOfBirth = in.nextInt();
        Date date = new Date();

        System.out.println(date);

        String actualYear = String.format("%tY", date);

        int actualYearInt = Integer.parseInt(actualYear);
        System.out.println("Ваш вік : " + (actualYearInt - yearOfBirth));*/


//        4
          /*  Scanner input = new Scanner(System.in);
            System.out.println("Введіть  ваше число ");
            int x = input.nextInt();
            System.out.println("Введіть ваше 2 число ");
            int y = input.nextInt();
            boolean result = x > y? true : false;
            String string = "Число " + x + " більше за "  + y +" і це " + result;
            System.out.print(string);*/

//        5
      /*Scanner input5 = new Scanner(System.in);
        System.out.println("Введіть число від 1 до 7 : ");
        int xx = input5.nextInt();
        if (xx == 1) {
            System.out.println("Понеділок");
        } else if (xx == 2) {
            System.out.println("Вівторок" );
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
        }*/

//        6



//7.
       /* Scanner in = new Scanner(System.in);
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
                */
    }

}





