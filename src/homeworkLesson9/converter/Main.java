package homeworkLesson9.converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter("Taniaaa");
        int x = converter.convertToInt('f');
        int a = converter.convertToInt(false);
        System.out.println(x);
        System.out.println(a);
        double d = converter.convertToDouble("345555");
        System.out.println(d);
    }
}
