package package1;

public class classwork1 {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.println("Введите ваше число(для остановки напишити FINAL");
            String input =scanner.nextLine();
            if(input.equals("FINAL")){
                break;
            }
            result = result + Integer.parseInt(input);
        }

        System.out.println(result);*/

        /*2)Заполнить массив на 45 элементов случайными числами
    от -50 до +50. Вывести в консоль сумму всех его элементов.*/
        /*int[] arrayInt3 = new int[ 50];
        Random random = new Random();
        int u = random.nextInt(50);
        System.out.println(u);

        for (int i = -50; i <= arrayInt3.length; i++){
            arrayInt3[i + 1]=random.nextInt(50);
            System.out.print(arrayInt3[i-1] + " ");*/
      /*  3)Заполнить массив на 45 элементов случайными числами
        от -13 до +30. Вывести в консоль все его нечетные числа которые делятся на три.*/

        int[] arrayInt4 = new int[43];
        for (int i = 0; i < arrayInt4.length; i++) {
            arrayInt4[i] = (int) ((Math.random() * 44) + 30);
            System.out.print(arrayInt4[i] + " ");

        }
        for (int i = 0; i < arrayInt4.length; i++)

        if ((arrayInt4[i] % 2 != 0 && (arrayInt4[i] % 3 == 0 )))
        System.out.println(arrayInt4[i]);
    }
}



