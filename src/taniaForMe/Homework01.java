package taniaForMe;

public class Homework01 {
    public static void main(String[] args) {

        int mercedes = (1 + (3 * (2 - 4)) % 3 + (11 - 7) * 2) + (3 - 5) * 3;
//        9+-6=3
        int volvo = mercedes * 3 - 9 % mercedes + 16 - (-mercedes);
//   9-0+16--3=28
        int opel = mercedes % volvo;
//    3%28=3.
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(opel);
//    Необходимо вычислить значения mersedes, volvo и opel.

//            2)
        int x = 3;
        int y = ++x * 2;
        x += -y * 3 + ++x + --y;
        y += (-x++) % 3;
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        x=3;
//        y=4*2=8;
//        x=4+-8*3+5+7;
//        y=7+(+8)%3=9
//        z=-7+9=2.
//        x=-7;y=9;z=2.
//        Необходимо вычислить значения x, y и z.


//            3)
        boolean a = (85 / 5 + (19 - 25 % 3)) == (-3) * (-2 + 14 / (-2)) && (2 % 7 - 1) * 3 <= 2;
//    30==--27&&0<=2 false
        boolean b = !a || a && !a;
//    true
        boolean c = false && !true || !((23 % 3 + 14) % 3 == 7);
//    true
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//    Необходимо вычислить значения a, b и c.
//
//      4)
//      Coздать две переменные типа int:
//    Поменять между собой значения переменных a и b.
//    Создавать новые переменные нельзя.
//    Можно применять только арифметические действия к перемнным a и b.
//    Вывести в консоль значения переменных a и b после их переопределения.
    int r = 7;
    int t = 9;
    r = r + t;
    t = r - t;
    r = r - t;
        System.out.println(r);
        System.out.println(t);
    }
}
