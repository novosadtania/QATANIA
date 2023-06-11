package homework10;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Tyu","FFf", 444,33, (new Pet("Dog", "Dag", 3, 44, new String[]{"Eat", "FFrfgd"})), "Moth", "Dad");
        System.out.println(human.toString());
    }
}
