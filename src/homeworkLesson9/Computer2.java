package homeworkLesson9;

public class Computer2 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", 3000,16,24);
        Computer computer2= new Computer("Dell",30022,16,24);
        System.out.println(computer1.equals(computer2));
        System.out.println("+++++++++++++++");
        computer1.getInfoComputer();
        System.out.println("=============");
        System.out.println(computer1);
        computer1.setPrice(4000);

    }
}
