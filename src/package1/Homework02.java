package package1;

public class Homework02 {
    public static void main(String[] args) {
//        1. Создать переменную string1 = "This line that i want to cut, cause it is too long"
//    Создать строку string2 в которой должно быть помещено значение строки string1
//    Обрезанное до "This line that i want to cut, cause".
//    Создать строку string3 на основе string2 которое будет содержать значение
//   "This line that don't want to cut, cause it is perfect".
//    Вывести на консоль каждое сообщение и его длину.
        int lenthOfString;
        String string1 = "This line that i want to cut, cause it is too long";
        lenthOfString = string1.length();
        System.out.println(string1 + " " + lenthOfString);
        String string2 = string1.replace("it is too long", " ");
        lenthOfString = string2.length();
        System.out.println(string2 + " " + lenthOfString);
        String string3 = string2.replace("that", "don't") + "it is perfect";
        lenthOfString = string3.length();
        System.out.println(string3 + " " + lenthOfString);
//
//
//            2. Создать строку string = "Testing , is my favourite job"
//    Вывести на экран отдельно каждое слово и длину этого слова в след виде:
//    Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
//    Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
//    и т.д.
//    Вывести на консоль true, если первое слово длиннее остальных, в
//    противном случае вывести false.
        String string = "Testing , is my favourite job";
        String[] arrayOfString = string.split("\\s");
        int size = arrayOfString.length;
        String word1 = string.split("\\s")[0];
        System.out.println(word1);
        String word2 = string.split("\\s")[2];
        System.out.println(word2);
        String word3 = string.split("\\s")[3];
        System.out.println(word3);
        String word4 = string.split("\\s")[4];
        System.out.println(word4);
        String word5 = string.split("\\s")[5];
        System.out.println(word5);


//            3. При применении к массиву строк поля length, можно узнать сколько
//    элементов находится в массиве.
//    Тоесть если у Вас есть массив строк типа:
//
//    String[] arrayOfString;
//
//    то при вызове поля lenth
//    int size = arrayOfString.length;
//
//    можно получить какое количество символов
//    находится в данном массиве.
//
//    Попробовать вывести на экран какое количество раз
//    символ 'a' встречается в  строке:
//            "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."
//    используя метод split и информацию по поводу поля length
//
//    Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.*/}
        String myString = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] arrayOfString = myString.split("a");
        int size = arrayOfString.length;
        System.out.println(myString);

    }
}

