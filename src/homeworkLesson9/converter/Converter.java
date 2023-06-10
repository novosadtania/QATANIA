package homeworkLesson9.converter;
/* 3) Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
    converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
    А также только один метод геттер для получения информации о названии данного конвертра.*/
public class Converter {
    public String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int convertToInt(byte b){
        return b;
    }
    public int convertToInt(short s){
        return s;
    }
    public int convertToInt(int i){
        return i;
    }
    public int convertToInt(long l){
        return (int) l;
    }
    public int convertToInt(char c){
        return c;
    }
    public int convertToInt(float f){
        return (int) f;
    }
    public int convertToInt(double d){
        return (int) d;
    }
    public int convertToInt(String s){
        return Integer.parseInt(s);
    }
    public int convertToInt(boolean b){
        System.out.println("Введено тип boolean");
        return 0;
    }
    public double convertToDouble(byte b){
        return b;
    }
    public double convertToDouble(short s){
        return s;
    }
    public double convertToDouble(int i){
        return i;
    }
    public double convertToDouble(long l){
        return l;
    }
    public double convertToDouble(char c){
        return c;
    }
    public double convertToDouble(float f){
        return f;
    }
    public double convertToDouble(double d){
        return  d;
    }
    public double convertToDouble(String s){
        return Integer.parseInt(s);
    }
    public double convertToDouble(boolean b){
        System.out.println("Введено тип boolean");
        return 0;
    }
    public String converToString(byte b){
        return String.valueOf(b);
    }
    public String converToString(short s){
        return String.valueOf(s);
    }
    public String converToString(int i){
        return String.valueOf(i);
    }
    public String converToString(long l){
        return String.valueOf(l);
    }
    public String converToString(char c){
        return String.valueOf(c);
    }
    public String converToString(float f){
        return String.valueOf(f);
    }
    public String converToString(double d){
        return String.valueOf(d);
    }
    public String converToString(String s){
        return s;
    }
    public String converToString(boolean b){
        return String.valueOf(b);}
    }
