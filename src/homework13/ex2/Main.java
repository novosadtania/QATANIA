package homework13.ex2;

public class Main {
    public static void main(String[] args) {
        ArrayMethod arrayMethod = new ArrayMethod();
        try {
            arrayMethod.arrayMethod();
        } catch (UnderZeroException | DoubleExcept e) {
            System.err.println(e.getMessage());
        }
    }
}
